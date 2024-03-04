package com.beratyesbek.youtubehibernate.core;

import com.beratyesbek.youtubehibernate.repository.redis.RedisCacheRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Aspect
@Configuration
@RequiredArgsConstructor
public class CacheAspectImpl {

    private final RedisCacheRepository redisCacheRepository;
    private final Logger logger = Logger.getLogger(CacheAspectImpl.class.getName());
    @Around("@annotation(CacheAspect)")
    public Object before(ProceedingJoinPoint joinPoint) throws Throwable {
        // Get method signature using reflection
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        CacheAspect cacheAspect = method.getAnnotation(CacheAspect.class);

        // Get Key from annotation
        String key = cacheAspect.key();
        // Get method arguments
        List<Class<?>> args = Arrays.asList(method.getParameterTypes());

        // Get hash code of method arguments to use as hash key because each key should be unique.
        // If request comes with same arguments, it should return from cache.
        String argsHashCode = getArgsHashCode(args);

        // Check if cache has the key
        Optional<Object> object = redisCacheRepository.findByHashKey(key, argsHashCode);

        // If cache has the key, return the value from cache
        if (object.isPresent()) {
            logger.info("Retrieved from the cache");
            return object.get();
        }

        // If cache does not have the key, proceed the method and save the result to cache
        Object result = joinPoint.proceed();
        redisCacheRepository.save(key, argsHashCode, result, cacheAspect.duration());
        return result;
    }

    public String getArgsHashCode(List<Class<?>> args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Class<?> arg : args) {
            stringBuilder.append(arg.hashCode());
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}

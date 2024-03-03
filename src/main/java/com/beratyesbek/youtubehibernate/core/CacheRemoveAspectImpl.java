package com.beratyesbek.youtubehibernate.core;

import com.beratyesbek.youtubehibernate.repository.redis.RedisCacheRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Aspect
@Configuration
@RequiredArgsConstructor
public class CacheRemoveAspectImpl {

   private final RedisCacheRepository repository;

   @After("@annotation(CacheRemoveAspect)")
   public void after(JoinPoint joinPoint) {
       MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
       Method method = methodSignature.getMethod();
       CacheRemoveAspect cacheRemoveAspect = method.getAnnotation(CacheRemoveAspect.class);
       repository.deleteAllKeysWithPrefix(cacheRemoveAspect.key());
   }
}

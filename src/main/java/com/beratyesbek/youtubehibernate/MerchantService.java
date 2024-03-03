package com.beratyesbek.youtubehibernate;

import com.beratyesbek.youtubehibernate.core.CacheAspect;
import com.beratyesbek.youtubehibernate.core.CacheRemoveAspect;
import com.beratyesbek.youtubehibernate.entity.index.Merchant;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MerchantService {
    @CacheAspect(key= "MerchantService.findByName", duration = 100)
    public List<Merchant> findByName(String name) {
        return getMerchant();
    }

    @CacheRemoveAspect(key= "MerchantService.findByName")
    public Merchant save(Merchant merchant){
        return merchant;
    }

    // Simulate the database
    private List<Merchant> getMerchant(){
        return List.of(
                Merchant.builder().name("Alice").build(),
                Merchant.builder().name("Berat").build(),
                Merchant.builder().name("Pepe").build()

        );
    }
}

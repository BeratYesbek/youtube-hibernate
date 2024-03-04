package com.beratyesbek.youtubehibernate.service;

import com.beratyesbek.youtubehibernate.core.CacheAspect;
import com.beratyesbek.youtubehibernate.core.CacheRemoveAspect;
import com.beratyesbek.youtubehibernate.entity.Merchant;
import com.beratyesbek.youtubehibernate.repository.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchantService {
    private final MerchantRepository merchantRepository;

    @CacheAspect(key = "MerchantService.findAll", duration = 100)
    public List<Merchant> findAll() {
        // localhost vs http://127.0.0.1/
        // my custom cache vs hibernate cache
        return merchantRepository.findAll();
    }

    @CacheRemoveAspect(key = {"MerchantService.findAll"})
    public Merchant save(Merchant merchant) {
        return merchantRepository.save(merchant);
    }


}

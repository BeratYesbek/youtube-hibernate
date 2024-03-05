package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
    List<Merchant> findByName(String name);
}

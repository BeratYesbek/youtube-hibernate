package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
}

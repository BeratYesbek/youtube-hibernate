package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.index.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
}

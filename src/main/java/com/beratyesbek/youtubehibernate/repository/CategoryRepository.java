package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

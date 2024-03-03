package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.Category;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @QueryHints({@QueryHint(name = "org.hibernate.cacheable", value = "true")})
    List<Category> findAllByCode(String code);
}

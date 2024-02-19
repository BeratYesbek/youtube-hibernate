package com.beratyesbek.youtubehibernate.entity;

import com.beratyesbek.youtubehibernate.entity.interitance.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "code")
    private String code;

    @OneToMany(mappedBy = "category", orphanRemoval = true, cascade = CascadeType.REMOVE)
    List<Product> products;

    @Override
    protected void prePersist() {
        super.prePersist();
    }
}

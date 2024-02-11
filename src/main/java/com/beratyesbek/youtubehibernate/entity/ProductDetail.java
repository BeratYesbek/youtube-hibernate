package com.beratyesbek.youtubehibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private String brand;
    private Boolean warranty;

    @OneToOne(mappedBy = "productDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private Product product;
}

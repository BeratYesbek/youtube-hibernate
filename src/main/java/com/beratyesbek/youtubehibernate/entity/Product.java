package com.beratyesbek.youtubehibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer quantity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_detail_id", referencedColumnName = "ID")
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "ID")
    private Category category;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "PRODUCT_TAG_REL",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "ID")
    )
    private Set<Tag> tags;

}

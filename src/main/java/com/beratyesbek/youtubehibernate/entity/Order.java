package com.beratyesbek.youtubehibernate.entity;

import jakarta.persistence.Embedded;

public class Order {

    @Embedded
    private Address address;
}

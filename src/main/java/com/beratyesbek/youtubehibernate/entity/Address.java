package com.beratyesbek.youtubehibernate.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String name;
    private String address;
    private String phone;
    private String website;
}

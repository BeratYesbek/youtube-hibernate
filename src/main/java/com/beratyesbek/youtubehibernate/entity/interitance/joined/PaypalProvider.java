package com.beratyesbek.youtubehibernate.entity.interitance.joined;

import com.beratyesbek.youtubehibernate.entity.interitance.BaseEntity;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class PaypalProvider extends Payment {
    private String paypalEmail;
    private String paypalPassword;
    private String paypalProviderName;

}

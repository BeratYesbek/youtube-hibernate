package com.beratyesbek.youtubehibernate.entity.interitance.joined;

import com.beratyesbek.youtubehibernate.entity.interitance.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment extends BaseEntity {
    private BigDecimal amount;
    private String currency;
    private String method;
}

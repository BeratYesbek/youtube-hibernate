package com.beratyesbek.youtubehibernate.entity.interitance.discriminator;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
@DiscriminatorValue("regular")
public class RegularAccessor extends MachineAccessor {
    private String ippAddress;
    private String macAddress;
    private List<String> logHistory;
}

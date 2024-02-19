package com.beratyesbek.youtubehibernate.entity.interitance.discriminator;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("root")
public class RootAccessor extends MachineAccessor{
    private String rootPassword;
    private String rootUsername;
    private String rootIpAddress;
    private String rootMacAddress;
}

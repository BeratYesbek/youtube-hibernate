package com.beratyesbek.youtubehibernate.entity.interitance.discriminator;

import com.beratyesbek.youtubehibernate.entity.interitance.BaseEntity;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="machine_accessor", discriminatorType = DiscriminatorType.STRING)
public class MachineAccessor extends BaseEntity {
    private String name;
    private String ipAddress;
    private String macAddress;
}

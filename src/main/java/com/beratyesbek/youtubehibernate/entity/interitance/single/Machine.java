package com.beratyesbek.youtubehibernate.entity.interitance.single;

import com.beratyesbek.youtubehibernate.entity.interitance.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Machine extends BaseEntity {
    private String name;
    private String operatingSystem;
    private String version;
    private String model;
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String display;
    private String ports;
    private String weight;
    private String dimensions;
    private String serialNumber;
    private String ipAddress;
    private String macAddress;
}

package com.beratyesbek.youtubehibernate.entity.interitance.single;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PublicMachine extends Machine {
    private String publicVpn;
    private String publicIp;
    private String publicMacAddress;
}

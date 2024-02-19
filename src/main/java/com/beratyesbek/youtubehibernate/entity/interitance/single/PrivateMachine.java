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
public class PrivateMachine extends Machine {
    private String password;
    private String username;
    private String privateVpn;

}

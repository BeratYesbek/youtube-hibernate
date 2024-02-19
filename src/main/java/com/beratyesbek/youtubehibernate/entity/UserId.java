package com.beratyesbek.youtubehibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class UserId implements Serializable {
    private String email;
    private String username;

}

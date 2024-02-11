package com.beratyesbek.youtubehibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @SequenceGenerator(name="pk_sequence",sequenceName="entity_id_seq", allocationSize=5, initialValue = 10)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
    @Column(name="id", unique=true, nullable=false)
    private Integer id;

    private String name;
}

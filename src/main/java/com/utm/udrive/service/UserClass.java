package com.utm.udrive.service;

import lombok.Data;
import org.hibernate.annotations.NaturalId;
import javax.persistence.*;

@Entity
@Data
public class UserClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surnname;
    private String address;
    @Column(nullable = false)
    @NaturalId
    private String email;
}

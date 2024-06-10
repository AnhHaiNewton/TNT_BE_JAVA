package com.tnt.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id; 

    @Column(unique = true, nullable = false, updatable = false, length = 36)
    private String uuid= UUID.randomUUID().toString();

    private String name;
    private String email;

   
    public Tenant() {
    }

    public Tenant(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public Tenant(String name, String email, String uuid) {
        this.name = name;
        this.email = email;
        this.uuid = uuid;
    }
}

package com.demo.databasedemo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GenerationType;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  Integer id;
    private String name;
    private String email;
    

    
}

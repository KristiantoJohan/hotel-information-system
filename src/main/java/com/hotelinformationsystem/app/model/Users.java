package com.hotelinformationsystem.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "users")
public class Users {
    /**
     *  Primary key of users table
     *  @default uuid
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


}

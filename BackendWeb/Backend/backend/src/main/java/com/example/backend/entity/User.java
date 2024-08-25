package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users") // Assuming the table name is 'users', you can customize it
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "Full_Name")
    private String fullname;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;
}
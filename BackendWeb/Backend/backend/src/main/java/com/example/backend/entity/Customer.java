package com.example.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
    @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "Full_Name")
    @NotEmpty(message = "Full Name shouldn't be empty")
    private String fullname;

    @Column(name = "Email")
    @NotEmpty(message = "Email shouldn't be empty")
    @Email(message = "Invalid email format")
    private String email;

    @Column(name = "Contact_Number")
    @NotEmpty(message = "Contact number shouldn't be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid contact number")
    private String contactNumber;
}
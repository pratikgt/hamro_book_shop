package com.example.backend.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserPojo {
    private Integer id;

    @NotEmpty(message = "Full Name shouldn't be empty")
    private String fullname;

    @NotEmpty(message = "Email shouldn't be empty")
    @Email(message = "Invalid email format")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email")
    private String email;

    @NotEmpty(message = "Password shouldn't be empty")
    private String password;
}
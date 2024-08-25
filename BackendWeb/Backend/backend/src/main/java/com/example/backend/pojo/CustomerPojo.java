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
public class CustomerPojo {
    private Integer id;

    @NotEmpty(message = "Full Name shouldn't be empty")
    private String fullname;

    @NotEmpty(message = "Email shouldn't be empty")
    @Email(message = "Invalid email format")
    private String email;

    @NotEmpty(message = "Contact number shouldn't be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid contact number")
    private String contactNumber;
}
package com.test.auth.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserDto {

    @Pattern(regexp = "^09{11}")
    private Long phoneNumber;
    private String username;
    private String password;
    private String name;
    private String family;
    @Pattern(regexp = "^\\d{10}$", message = "کد ملی اشتباه است")
    private Long nationalId;
}

package com.hypertek.dto;

import com.hypertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String enabled;
    private String phone;
    private RoleDto roleDto;
    private Gender gender;

}

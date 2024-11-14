package com.example.rolemanagement.dto;


import com.example.rolemanagement.entity.Role;
import lombok.Data;


import java.util.Set;

@Data
public class UserDto {
    private String username;
    private String email;
    private String password;
    private Role roles;
}
package com.akhilsreekar.userservice.dtos;

import com.akhilsreekar.userservice.models.Role;
import com.akhilsreekar.userservice.models.User;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserDto {
    private String name;
    private String email;
    private List<Role> roles;
    private boolean isEmailVerified;

    public static UserDto from(User user){
        if(user==null) return null;
        UserDto userDto = new UserDto();
        userDto.name = user.getName();
        userDto.email = user.getEmail();
        userDto.roles = user.getRoles();
        userDto.isEmailVerified = user.isEmailVerified();
        return userDto;
    }
}

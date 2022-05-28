package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Setter
@Getter
public class User {
    @NotEmpty
    @NotNull
    private String username;
    @NotEmpty
    @NotNull
    private String password;
}


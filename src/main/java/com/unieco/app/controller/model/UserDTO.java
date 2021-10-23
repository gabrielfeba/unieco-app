package com.unieco.app.controller.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private Long id;

    private String name;

    private LocalDate birthDate;

    private String phoneDescription;

    private String email;

    private String userName;

    private String password;

    private String userType;

    private EnterpriseDTO enterprise;

}

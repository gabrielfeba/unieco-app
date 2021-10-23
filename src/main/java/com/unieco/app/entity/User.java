package com.unieco.app.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "usuario")
public class User {

    @Id
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "DS_NOME")
    private String name;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate birthDate;

    @Column(name = "DS_TELEFONE")
    private String phoneDescription;

    @Column(name = "DS_EMAIL")
    private String email;

    @Column(name = "CD_USUARIO")
    private String password;

    @Column(name = "FG_TIPO_LOGIN")
    private String userType;


}

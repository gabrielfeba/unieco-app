package com.unieco.app.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "endereco")
@Data
public class Address {

    @Id
    @Column(name = "ID_ENDERECO")
    private Long id;
    @Column(name = "ID_EMPREEENDIMENTO")
    private Long enterpriseId;

    @Column(name = "DS_RUA")
    private String street;

    @Column(name = "CD_CEP")
    private String postalCode;

    @Column(name = "DS_NUMERO_RESIDENCIA")
    private String number;

    @Column(name = "DS_CIDADE")
    private String city;

    @Column(name = "DS_ESTADO")
    private String state;

    @Column(name = "DS_COMPLEMENTO")
    private String complement;

    @Column(name = "FG_ATIVO")
    private String activeFlag;


}

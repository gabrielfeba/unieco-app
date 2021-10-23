package com.unieco.app.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "empreendimento")
public class Enterprise {

    @Id
    @Column(name = "ID_EMPREENDIMENTO")
    private Long id;

    @Column(name = "ID_USUARIO")
    private Long userId;

    @Column(name = "DS_URL_IMAGE")
    private String imageUrl;

    @Column(name = "DS_SOCIAL_REASON")
    private String document;

    @Column(name = "CD_CPF_OR_CNPJ")
    private String documentTypeCode;

    @Column(name = "DS_OFFICE")
    private String office;

    @Column(name = "CD_WHATSAPP")
    private String whatsapp;

    @Column(name = "DS_SITE")
    private String siteUrl;

    @Column(name = "DS_EMAIL_CORP")
    private String email;

    @Column(name = "DS_RESUMO")
    private String summary;

    @Column(name = "DS_FACEBOOK")
    private String facebookUrl;

    @Column(name = "FG_ACTIVE")
    private String active;

    @Column(name = "DS_INSTAGRAM")
    private String instagram;

}

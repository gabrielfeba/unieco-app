package com.unieco.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "empreendimento")
public class Enterprise {

    @Id
    @Column(name = "ID_EMPREENDIMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}

package com.unieco.app.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "endereco")
@Entity
public class Address {

    @Id
    @Column(name = "ID_ENDERECO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ID_EMPREENDIMENTO")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }
}

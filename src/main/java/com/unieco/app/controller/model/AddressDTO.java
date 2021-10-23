package com.unieco.app.controller.model;

import lombok.Data;

@Data
public class AddressDTO {

    private Long id;

    private Long enterpriseId;

    private String street;

    private String postalCode;

    private String number;

    private String city;

    private String state;

    private String complement;

    private String activeFlag;

}

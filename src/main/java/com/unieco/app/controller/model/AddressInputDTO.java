package com.unieco.app.controller.model;

import lombok.Data;

@Data
public class AddressInputDTO {

    private Long enterpriseId;

    private String street;

    private String postalCode;

    private String number;

    private String city;

    private String state;

    private String complement;

    private String activeFlag;

}

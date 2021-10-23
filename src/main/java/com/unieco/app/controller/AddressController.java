package com.unieco.app.controller;

import com.unieco.app.controller.mapper.AddressMapper;
import com.unieco.app.controller.model.AddressDTO;
import com.unieco.app.controller.model.AddressInputDTO;
import com.unieco.app.entity.Address;
import com.unieco.app.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService service;

    @Autowired
    private AddressMapper mapper;

    @PutMapping("/address")
    public ResponseEntity<AddressDTO> save(@RequestBody AddressInputDTO addressInputDTO) {
        Address response = service.save(mapper.map(addressInputDTO));
        return  ResponseEntity.ok(mapper.map(response));
    }

    @PostMapping("/address")
    public ResponseEntity<AddressDTO> save(@RequestBody AddressDTO addressDTO) {
        Address response = service.save(mapper.map(addressDTO));
        return  ResponseEntity.ok(mapper.map(response));
    }
}

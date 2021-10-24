package com.unieco.app.controller;

import com.unieco.app.controller.mapper.EnterpriseMapper;
import com.unieco.app.controller.model.EnterpriseDTO;
import com.unieco.app.controller.model.EnterpriseInputDTO;
import com.unieco.app.entity.Enterprise;
import com.unieco.app.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {

    @Autowired
    private EnterpriseService service;

    @Autowired
    private EnterpriseMapper mapper;

    @PutMapping("/enterprise")
    public ResponseEntity<EnterpriseDTO> save(@RequestBody EnterpriseInputDTO enterpriseInputDTO) {
        Enterprise response = service.save(mapper.map(enterpriseInputDTO));
        return  ResponseEntity.ok(mapper.map(response));
    }

    @PostMapping("/enterprise")
    public ResponseEntity<EnterpriseDTO> save(@RequestBody EnterpriseDTO enterpriseDTO) {
        Enterprise response = service.save(mapper.map(enterpriseDTO));
        return  ResponseEntity.ok(mapper.map(response));
    }
}

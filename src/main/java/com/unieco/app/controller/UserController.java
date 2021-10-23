package com.unieco.app.controller;

import com.unieco.app.controller.mapper.UserMapper;
import com.unieco.app.controller.model.UserDTO;
import com.unieco.app.controller.model.UserInputDTO;
import com.unieco.app.entity.User;
import com.unieco.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private UserService service;

    @PutMapping("/user")
    public ResponseEntity<UserDTO> save(@RequestBody UserInputDTO userInputDTO) {
        User response = service.save(mapper.map(userInputDTO));
        return  ResponseEntity.ok(mapper.map(response));
    }
}

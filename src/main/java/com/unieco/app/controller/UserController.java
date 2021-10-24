package com.unieco.app.controller;

import com.unieco.app.controller.mapper.UserMapper;
import com.unieco.app.controller.model.UserDTO;
import com.unieco.app.controller.model.UserInputDTO;
import com.unieco.app.entity.User;
import com.unieco.app.service.UserDataService;
import com.unieco.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private UserService service;

    @Autowired
    private UserDataService userDataService;

    @PutMapping("/user")
    public ResponseEntity<UserDTO> save(@RequestBody UserInputDTO userInputDTO) {
        User response = service.save(mapper.map(userInputDTO));
        return  ResponseEntity.ok(mapper.map(response));
    }

    @PostMapping("/user")
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {
        User response = service.save(mapper.map(userDTO));
        return  ResponseEntity.ok(mapper.map(response));
    }

    @GetMapping("/user/data/{username}")
    public ResponseEntity<UserDTO> getDataForUserName(@PathVariable("username") String username) {
        UserDTO response = userDataService.getDataForUserName(username);
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping("/user/data/{username}")
    public ResponseEntity<Void> deleteDataForUserName(@PathVariable("username") String username) {
        userDataService.deleteDataForUserName(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

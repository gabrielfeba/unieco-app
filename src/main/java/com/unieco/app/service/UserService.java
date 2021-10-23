package com.unieco.app.service;

import com.unieco.app.entity.User;
import com.unieco.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User save(User user) {
        return repository.save(user);
    }
}

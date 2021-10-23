package com.unieco.app.service;

import com.unieco.app.entity.Address;
import com.unieco.app.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Address save(Address address) {
        return repository.save(address);
    }
}

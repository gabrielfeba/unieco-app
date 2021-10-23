package com.unieco.app.service;

import com.unieco.app.entity.Enterprise;
import com.unieco.app.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository repository;

    public Enterprise save(Enterprise enterprise) {
        return repository.save(enterprise);
    }
}

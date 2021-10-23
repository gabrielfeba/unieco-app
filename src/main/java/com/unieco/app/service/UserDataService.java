package com.unieco.app.service;

import com.unieco.app.controller.mapper.AddressMapper;
import com.unieco.app.controller.mapper.EnterpriseMapper;
import com.unieco.app.controller.mapper.UserMapper;
import com.unieco.app.controller.model.AddressDTO;
import com.unieco.app.controller.model.EnterpriseDTO;
import com.unieco.app.controller.model.UserDTO;
import com.unieco.app.entity.Address;
import com.unieco.app.entity.Enterprise;
import com.unieco.app.entity.User;
import com.unieco.app.repository.AddressRepository;
import com.unieco.app.repository.EnterpriseRepository;
import com.unieco.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDataService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Autowired
    private UserMapper userMapper;


    public UserDTO getDataForUserName(String username) {
        Optional<User> userOptional = userRepository.findByUserName(username);
        if(userOptional.isPresent()) {
            User user = userOptional.get();
            EnterpriseDTO enterprise = getEnterprise(user.getId());
            UserDTO userDTO = userMapper.map(user);
            userDTO.setEnterprise(enterprise);
        }
        return null;
    }

    private EnterpriseDTO getEnterprise(Long userId) {
        Optional<Enterprise> enterpriseOptional = enterpriseRepository.findByUserId(userId);
        if(enterpriseOptional.isPresent()) {
            Enterprise enterprise = enterpriseOptional.get();
            AddressDTO address = getAddress(enterprise.getId());
            EnterpriseDTO enterpriseDTO = enterpriseMapper.map(enterprise);
            enterpriseDTO.setAddressDTO(address);
        }
        return null;
    }

    private AddressDTO getAddress(Long enterpriseId) {
        Optional<Address> addressOptional = addressRepository.findByEnterpriseId(enterpriseId);
        if(addressOptional.isPresent()) {
            Address address = addressOptional.get();
            return addressMapper.map(address);
        }
        return null;
    }
}

package com.unieco.app.controller.mapper;

import com.unieco.app.controller.model.AddressDTO;
import com.unieco.app.controller.model.AddressInputDTO;
import com.unieco.app.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address map(AddressInputDTO addressInputDTO);

    AddressDTO map(Address address);
}

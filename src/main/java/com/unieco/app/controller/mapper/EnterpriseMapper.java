package com.unieco.app.controller.mapper;

import com.unieco.app.controller.model.EnterpriseDTO;
import com.unieco.app.controller.model.EnterpriseInputDTO;
import com.unieco.app.entity.Enterprise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnterpriseMapper {

    Enterprise map(EnterpriseInputDTO enterpriseInputDTO);

    EnterpriseDTO map(Enterprise enterprise);

    Enterprise map(EnterpriseDTO enterpriseDTO);
}

package com.unieco.app.controller.mapper;

import com.unieco.app.controller.model.UserDTO;
import com.unieco.app.controller.model.UserInputDTO;
import com.unieco.app.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(UserInputDTO userInputDTO);

    UserDTO map(User user);
}

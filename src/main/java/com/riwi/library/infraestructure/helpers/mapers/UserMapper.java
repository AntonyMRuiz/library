package com.riwi.library.infraestructure.helpers.mapers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.library.api.dto.request.UserRequest;
import com.riwi.library.api.dto.response.UserResponse;
import com.riwi.library.domain.entities.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    UserEntity toUserEntity(UserRequest userRequest);

    UserResponse toUserResponse(UserEntity userEntity);

    List<UserResponse> UserListToResponseList(List<UserEntity> userEntities);

}

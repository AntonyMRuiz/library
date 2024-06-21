package com.riwi.library.infraestructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.library.api.dto.request.UserRequest;
import com.riwi.library.api.dto.response.UserResponse;
import com.riwi.library.domain.entities.UserEntity;
import com.riwi.library.domain.repositories.UserRepository;
import com.riwi.library.infraestructure.abstract_services.IUserService;
import com.riwi.library.infraestructure.helpers.mapers.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserResponse create(UserRequest request) {
        UserEntity userEntity = this.userMapper.toUserEntity(request);
        return this.userMapper.toUserResponse(this.userRepository.save(userEntity));
    }

    @Override
    public UserResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public UserResponse update(Long id, UserRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}

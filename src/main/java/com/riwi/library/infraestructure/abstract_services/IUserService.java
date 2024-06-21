package com.riwi.library.infraestructure.abstract_services;

import com.riwi.library.api.dto.request.UserRequest;
import com.riwi.library.api.dto.response.UserResponse;

public interface IUserService extends GenericService<UserRequest, UserResponse, Long> {
    
}

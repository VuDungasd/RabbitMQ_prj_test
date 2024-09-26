package com.example.springbootRabbitMQ.usermanagement;

import com.example.springbootRabbitMQ.usermanagement.dto.CreateUserDTO;
import com.example.springbootRabbitMQ.usermanagement.dto.GenericResponseDTO;

public interface UserService {
    GenericResponseDTO saveUser(CreateUserDTO createUserDTO);

}
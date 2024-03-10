package com.authenticationApp.services;


import com.authenticationApp.dtos.LoginUserDto;
import com.authenticationApp.dtos.RegisterUserDto;
import com.authenticationApp.exceptions.CustomAuthenticationException;
import com.authenticationApp.models.User;
//import org.springframework.security.core.userdetails.UserDetailsService;


public interface AuthService {// extends UserDetailsService

    User registerUser(RegisterUserDto registerUserDto) throws CustomAuthenticationException;

    User authenticateUser(LoginUserDto loginUserDto) throws CustomAuthenticationException;

}

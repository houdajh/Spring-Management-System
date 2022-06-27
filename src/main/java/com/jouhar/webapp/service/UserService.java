package com.jouhar.webapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.jouhar.webapp.dto.UserRegistrationDto;
import com.jouhar.webapp.model.User;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
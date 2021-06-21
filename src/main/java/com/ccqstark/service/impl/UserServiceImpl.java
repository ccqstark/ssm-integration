package com.ccqstark.service.impl;

import com.ccqstark.entity.User;
import com.ccqstark.repository.UserRepository;
import com.ccqstark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

}

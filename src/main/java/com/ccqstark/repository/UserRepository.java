package com.ccqstark.repository;

import com.ccqstark.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
}

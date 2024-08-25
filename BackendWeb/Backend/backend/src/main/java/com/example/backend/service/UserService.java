package com.example.backend.service;

import com.example.backend.entity.User;
import com.example.backend.pojo.UserPojo;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveData(UserPojo userPojo);

    List<User> getData();

    void deleteData(Integer id);

    Optional<User> getById(Integer id);
}
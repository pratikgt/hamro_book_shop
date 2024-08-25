package com.example.backend.service.impl;

import com.example.backend.entity.User;
import com.example.backend.pojo.UserPojo;
import com.example.backend.repository.UserRepository;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void saveData(UserPojo userPojo) {
        User user = new User();
        user.setId(userPojo.getId());
        user.setFullname(userPojo.getFullname());
        user.setEmail(userPojo.getEmail());
        user.setPassword(userPojo.getPassword());
        userRepository.save(user);
    }

    @Override
    public List<User> getData() {
        return userRepository.findAll();
    }

    @Override
    public void deleteData(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> getById(Integer id) {
        return userRepository.findById(id);
    }
}
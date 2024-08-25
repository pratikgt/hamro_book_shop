package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.pojo.GlobalApiResponse;
import com.example.backend.pojo.UserPojo;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public GlobalApiResponse<String> save(@RequestBody UserPojo userPojo) {
        GlobalApiResponse<String> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully saved");
        globalApiResponse.setData("saved");
        userService.saveData(userPojo);
        return globalApiResponse;
    }

    @GetMapping("/get")
    public GlobalApiResponse<List<User>> getData() {
        GlobalApiResponse<List<User>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully retrieved the data");
        globalApiResponse.setData(userService.getData());
        return globalApiResponse;
    }

    @GetMapping("/get/{id}")
    public GlobalApiResponse<Optional<User>> getById(@PathVariable Integer id) {
        GlobalApiResponse<Optional<User>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully retrieved the data by id");
        globalApiResponse.setData(userService.getById(id));
        return globalApiResponse;
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully deleted");
        globalApiResponse.setData(id);
        userService.deleteData(id);
        return globalApiResponse;
    }

    @PutMapping("/update")
    public GlobalApiResponse<Integer> update(@RequestBody UserPojo userPojo) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully updated the data");
        globalApiResponse.setData(userPojo.getId());
        userService.saveData(userPojo);
        return globalApiResponse;
    }
}
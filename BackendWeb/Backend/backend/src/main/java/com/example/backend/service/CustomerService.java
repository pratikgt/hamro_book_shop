package com.example.backend.service;

import com.example.backend.entity.Customer;
import com.example.backend.pojo.CustomerPojo;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    void saveData(CustomerPojo customerPojo);
    List<Customer> getData();
    void deleteData(Integer id);
    Optional<Customer> getById(Integer id);
}
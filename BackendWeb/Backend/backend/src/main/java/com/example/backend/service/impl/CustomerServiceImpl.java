package com.example.backend.service.impl;

import com.example.backend.entity.Customer;
import com.example.backend.pojo.CustomerPojo;
import com.example.backend.repository.CustomerRepository;
import com.example.backend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void saveData(CustomerPojo customerPojo) {
        Customer customer = new Customer();
        customer.setId(customerPojo.getId());
        customer.setFullname(customerPojo.getFullname());
        customer.setEmail(customerPojo.getEmail());
        customer.setContactNumber(customerPojo.getContactNumber());
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getData() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteData(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> getById(Integer id) {
        return customerRepository.findById(id);
    }
}
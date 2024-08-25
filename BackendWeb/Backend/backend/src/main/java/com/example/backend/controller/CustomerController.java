package com.example.backend.controller;

import com.example.backend.entity.Customer;
import com.example.backend.pojo.CustomerPojo;
import com.example.backend.pojo.GlobalApiResponse;
import com.example.backend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/save")
    public GlobalApiResponse<String> save(@RequestBody CustomerPojo customerPojo) {
        GlobalApiResponse<String> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully saved");
        globalApiResponse.setData("saved");
        customerService.saveData(customerPojo);
        return globalApiResponse;
    }

    @GetMapping("/get")
    public GlobalApiResponse<List<Customer>> getData() {
        GlobalApiResponse<List<Customer>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully retrieved the data");
        globalApiResponse.setData(customerService.getData());
        return globalApiResponse;
    }

    @GetMapping("/get/{id}")
    public GlobalApiResponse<Optional<Customer>> getById(@PathVariable Integer id) {
        GlobalApiResponse<Optional<Customer>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully retrieved the data by id");
        globalApiResponse.setData(customerService.getById(id));
        return globalApiResponse;
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully deleted");
        globalApiResponse.setData(id);
        customerService.deleteData(id);
        return globalApiResponse;
    }

    @PutMapping("/update")
    public GlobalApiResponse<Integer> update(@RequestBody CustomerPojo customerPojo) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully updated the data");
        globalApiResponse.setData(customerPojo.getId());
        customerService.saveData(customerPojo);
        return globalApiResponse;
    }
}
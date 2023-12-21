package com.qins.controller;


import com.qins.dao.CustomerMapper;
import com.qins.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerMapper customerMapper;
    @PutMapping("add")
    public String add(Customer customer){
        return ""+customerMapper.add(customer);
    }

}

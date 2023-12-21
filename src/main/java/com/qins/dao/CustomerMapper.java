package com.qins.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.qins.pojo.Customer;

@Repository
@Mapper
public interface CustomerMapper {
    int add(Customer customer) ;


}

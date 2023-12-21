package com.qins.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public class CustomerMapper {
    int add(CustomerMapper customerMapper);
}

package com.qins.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String cname;
    private String category;
    private String phoneNumber;
    private String email;
    private String address;
    private String region;
    private String manager;
    private Date registrationDate;
    private Timestamp lastDealTime;
    private String remark;


}

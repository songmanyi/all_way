package com.my.bizuser.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private String id;
    private String account;
    private String password;
    private String userName;
    private Date createDate;
    private Date updateDate;
    private Integer deleted;
    private String remark;

}

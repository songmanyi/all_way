package com.my.bizuser.data.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    private String id;
    private String account;
    private String password;
    private String userName;
    private Date createDate;
    private Date updateDate;
    private String remark;

    private String token;

}

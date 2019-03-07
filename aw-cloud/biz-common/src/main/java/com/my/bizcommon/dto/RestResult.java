package com.my.bizcommon.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RestResult implements Serializable {

    private boolean success = false;
    private Integer targetId = null;
    private Integer errorCode = 0;
    private String message = null;


}

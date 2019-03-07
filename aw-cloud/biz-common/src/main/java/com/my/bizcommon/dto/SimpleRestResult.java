package com.my.bizcommon.dto;

import lombok.Data;

@Data
public class SimpleRestResult<T> extends RestResult {

    private T data;

}

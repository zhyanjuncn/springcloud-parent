package com.czb.account.domain;

import lombok.Data;

@Data
public class CustomResult<T> {

    private String msg;
    private Integer code;
    private T record;
}

package com.czb.account.domain;

import lombok.Data;

@Data
public class Result<T> {

    private Object T;

    private String msg;

    private Integer code;

}

package com.czb.account.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = -6647467188205418658L;

    private Long id;
    private String name;
    private String password;
    private Integer sate;
}

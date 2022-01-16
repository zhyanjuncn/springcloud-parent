package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 2668751396019767759L;
    //user-dev
    private Long userId;
    //user-dev
    private String username;
    //user-dev
    private String password;
    //user-dev
    private String provinceName;
    //phone-dev
    private String phone;
    //createTime-dev
    private Date createTime;
    //updateTime-dev
    private Date updateTime;
}

package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private static final long serialVersionUID = -8878506357935780801L;
    //develop
    private Long masterId;
    //develop
    private String username;
    //develop
    private String password;
    //develop
    private String phone;
    //develop
    private Integer state;
    //develop
    private Date createTime;
    //develop
    private Date updateTime;
}

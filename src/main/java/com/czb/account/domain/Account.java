package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
//master
public class Account implements Serializable {//账户
    private static final long serialVersionUID = -8878506357935780801L;
    //master
    private Long masterId;

    //master
    private String username;

    //master
    private String password;

    //master
    private String phone;

    //master
    private Integer state;

    //master
    private Date createTime;

    //master
    private Date updateTime;
}

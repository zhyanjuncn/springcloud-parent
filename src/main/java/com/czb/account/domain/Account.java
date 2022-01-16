package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account extends Model<Account> {

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

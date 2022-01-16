package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

@Data
public class User extends Model<User> {//用户

    //master
    private Long id;

    //master
    private String nickname;

    //master
    private String password;

    //master
    private String provinceName;

    //master
    private Date addTime;

    //master
    private Date updateTime;
}

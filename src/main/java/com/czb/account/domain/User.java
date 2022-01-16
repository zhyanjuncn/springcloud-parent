package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

import java.io.Serializable;
import java.util.Date;

@Data
<<<<<<< HEAD
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
=======
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
>>>>>>> master
    private Date updateTime;
}

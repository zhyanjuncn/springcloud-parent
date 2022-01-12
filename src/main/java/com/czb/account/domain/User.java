package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class User extends Model<User> {

    //用户id
    private Long id;
    //用户名
    private String nickname;
    //用户密码
    private String password;
    //用户省
    private String provinceName;
}

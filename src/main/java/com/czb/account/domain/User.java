package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class User extends Model<User> {

    //userId
    private Long id;
    //昵称
    private String nickname;
    //密码
    private String password;
    //省
    private String provinceName;
}

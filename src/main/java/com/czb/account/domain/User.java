package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class User extends Model<User> {

    //user
    private Long userId;
    //user
    private String username;
    //user
    private String password;
    //user
    private String provinceName;
    //phone
    private String phone;
    //
}

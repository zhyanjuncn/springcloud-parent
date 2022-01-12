package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class User extends Model<User> {

    //userId
    private Long id;
    private String nickname;
    private String password;
    private String provinceName;
}

package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class User extends Model<User> {

    //user
    private Long id;
    //user
    private String nickname;
    //user
    private String password;
    //user
    private String provinceName;
}

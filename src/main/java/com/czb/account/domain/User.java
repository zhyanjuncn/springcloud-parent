package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class User extends Model<User> {

    //user111
    private Long id;

    //user111
    private String nickname;


    //user111
    private String password;


    //user111
    private String provinceName;
}

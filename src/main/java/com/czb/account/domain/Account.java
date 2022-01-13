package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account extends Model<Account> {

    private static final long serialVersionUID = -8878506357935780801L;

<<<<<<< HEAD
    //00000
    private Long accountId;
    //00000
    private String username;
    //00000
    private String password;
    //00000
    private String phone;
    //00000
=======
    //用户ID
    private Long userId;
    //用户名
    private String username;
    //密码
    private String password;
    //手机号
    private String phone;
    //城市名称
>>>>>>> master
    private String cityName;
}

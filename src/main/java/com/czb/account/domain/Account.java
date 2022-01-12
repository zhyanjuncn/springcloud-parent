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

    //会员-id
    private Long accountId;
    //用户名id
    private String username;
    //密码id
    private String password;
    //phone-id
    private String phone;
    private String cityName;
}

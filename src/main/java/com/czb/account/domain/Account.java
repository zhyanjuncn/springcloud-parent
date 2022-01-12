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

    //会员
    private Long accountId;
    //会员
    private String username;
    //会员
    private String password;
    //会员
    private String phone;
    //会员
    private String cityName;
}

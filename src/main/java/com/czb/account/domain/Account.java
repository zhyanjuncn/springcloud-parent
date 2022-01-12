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

    //主键
    private Long accountId;
    private String username;
    private String password;
    private String phone;
    private String cityName;
}

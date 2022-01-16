package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
public class Account implements Serializable {
=======
@Accessors(chain = true)
@Builder
public class Account extends Model<Account> {//账户

>>>>>>> master
    private static final long serialVersionUID = -8878506357935780801L;
    //develop
    private Long masterId;
    //develop
    private String username;
    //develop
    private String password;
    //develop
    private String phone;
    //develop
    private Integer state;
    //develop
    private Date createTime;
    //develop
    private Date updateTime;
}

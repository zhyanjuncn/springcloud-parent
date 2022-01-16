package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends Model<User> {//用户

    //master
    private Long id;

    //master
    private String nickname;

    //master
    private String password;

    //master
    private String provinceName;

    //master
    private Date addTime;

    //master
    private Date updateTime;
}

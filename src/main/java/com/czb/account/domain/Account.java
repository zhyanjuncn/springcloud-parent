package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@Accessors(chain = true)
@TableName("account")
public class Account implements Serializable {//账户类
    private static final long serialVersionUID = -8878506357935780801L;

    //id
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    //username
    private String username;
    //password
    private String password;
    //phone
    private String phone;
    //city
    private String city;
    //province
    private String province;
    //状态 0-默认 1-删除
    private Integer state;
    //createTime
    private Date createTime;
    //updateTime;
    private Date updateTime;
}

package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("name")
public class User implements Serializable {
    private static final long serialVersionUID = 2668751396019767759L;

    //id
    @TableId(value = "id",type = IdType.AUTO)
    private Long userId;
    //用户名
    private String username;
    //密码
    private String password;
    //省份
    private String provinceName;
    //手机号
    private String phone;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}

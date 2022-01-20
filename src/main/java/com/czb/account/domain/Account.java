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

/**
 * zyj
 */
@Data
@AllArgsConstructor
@TableName(value = "account",autoResultMap = true)
public class Account implements Serializable {
    ////账户实体类
    private static final long serialVersionUID = -8878506357935780801L;
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    //用户名
    private String username;
    //密码
    private String password;
    //手机号
    private String phone;
    //城市
    private String city;
    //省份
    private String province;
    //状态 0-默认 1-删除
    private Integer state;
    //创建时间
    private Date createTime;
    //更新时间;
    private Date updateTime;
}

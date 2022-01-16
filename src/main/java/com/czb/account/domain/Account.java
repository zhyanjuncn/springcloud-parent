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
@Accessors(chain = true)
@Builder
public class Account implements Serializable {//develop-账户类
    private static final long serialVersionUID = -8878506357935780801L;
    //0
    private String username;
    //0
    private String password;
    //0
    private String phone;
    //0
    private Integer state;
    //0
    private Date updateTime;
}

package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@TableName(value = "cart_user",autoResultMap = true)
public class Cart implements Serializable {
    private static final long serialVersionUID = 312548767024950474L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Long userId;
    private Integer state;
    private Date createTime;
    private Date updateTime;

}

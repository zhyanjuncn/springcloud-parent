package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("item")
public class Item implements Serializable {
    private static final long serialVersionUID = -5647418285116652440L;//lucy

    //id
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    //品牌
    private String itemBrand;
    //名称
    private String itemName;
    //分类
    private String itemCategory;
    //状态
    private String state;
    //创建时间
    private Date addTime;
    //更新时间
    private Date renewTime;

}

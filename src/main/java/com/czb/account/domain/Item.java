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

/**
 * zyj
 */
@Data
@AllArgsConstructor
//@TableName(value = "item",autoResultMap = true)
public class Item implements Serializable {
    ////商品实体类
    private static final long serialVersionUID = -5647418285116652440L;
    //@TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 名称
     */
    private String name;
    /**
     * 分类
     */
    private String categoryId;
    /**
     * 状态
     */
    private String state;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}

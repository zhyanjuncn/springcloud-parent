package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

<<<<<<< HEAD
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("item")
public class Item extends Model<Item> {//lucy


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
=======
import java.io.Serializable;
import java.util.Date;
>>>>>>> master

@Data
public class Item implements Serializable {

    //id
    private Long itemId;
    private static final long serialVersionUID = -3047215372788903948L;
    //品牌
    private String name;
    //名称
    private String brand;
    //分类
    private String category;
    //状态
    private Integer state;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}

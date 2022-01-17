package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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

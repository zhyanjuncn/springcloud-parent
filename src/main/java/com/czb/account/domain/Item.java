package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Item extends Model<Item> {
    //id
    private Long id;
    //品牌
    private String brand;
    //商品名称
    private String itemName;
    //分类
    private String category;

}

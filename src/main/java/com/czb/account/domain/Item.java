package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Item extends Model<Item> {
    //商品
    private Long id;
    //商品
    private String brand;
    //商品
    private String itemName;
    //商品
    private String category;

}

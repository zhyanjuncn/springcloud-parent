package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Item extends Model<Item> {

    private Long id;
    private String brand;
    private String itemName;
    private String category;

}

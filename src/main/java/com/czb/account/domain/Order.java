package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Order extends Model<Order> {

    //order111
    private Long orderId;
    //order111
    private Long skuId;
    //order111
    private Long spuId;

    //order111
    private Integer num;

    //order111
    private String state;
}

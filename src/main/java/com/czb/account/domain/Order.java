package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Order extends Model<Order> {

    //order
    private Long orderId;
    //order
    private Long skuId;
    //order
    private Long spuId;
    //order库存
    private Integer num;
    //order状态
    private String state;

}

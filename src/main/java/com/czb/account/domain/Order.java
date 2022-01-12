package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Order extends Model<Order> {

    //订单id
    private Long orderId;
    //订单skuid
    private Long skuId;
    //订单spuid
    private Long spuId;
}

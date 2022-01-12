package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Order extends Model<Order> {

    //订单id
    private Long userId;
    //skuId
    private Long skuId;
    //spuId
    private Long spuId;
}

package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Order extends Model<Order> {

    //merge
    private Long userId;
    //merge
    private Long skuId;
    //merge
    private Long spuId;
}

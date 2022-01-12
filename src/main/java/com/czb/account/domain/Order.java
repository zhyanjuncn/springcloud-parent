package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Order extends Model<Order> {

    private Long userId;
    private Long skuId;
    private Long spuId;
}

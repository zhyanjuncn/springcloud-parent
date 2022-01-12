package com.czb.account.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class Order extends Model<Order> {

<<<<<<< HEAD
    //订单id
=======
    //git merge
>>>>>>> c92e58e ('message')
    private Long userId;
    //skuId
    private Long skuId;
    //spuId
    private Long spuId;
}

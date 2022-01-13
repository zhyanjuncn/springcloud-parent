package com.czb.account.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Order implements Serializable {
    private static final long serialVersionUID = -6980009311339814453L;

    //订单属性
    //订单id
    private Long id;

    private Long userId;

    private Long skuId;

    private Long spuId;

    private BigDecimal totalMoney;

    private Integer num;

    private BigDecimal price;

    private Date createTime;

    private Date updateTime;

    //计算商品总价格
    private BigDecimal getTotal(BigDecimal price,Integer num){
        return new BigDecimal(price.intValue()*num);
    }
}

package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("order")
public class Order implements Serializable {//lucy
    private static final long serialVersionUID = -6980009311339814453L;

    //订单id
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private Long userId;
    private Long skuId;
    private Long spuId;
    private BigDecimal totalMoney;
    private Integer num;
    private BigDecimal price;
    private Date createTime;
    private Date updateTime;
    private Integer status;

    //计算商品总价格
    private BigDecimal getTotal(BigDecimal price,Integer num){
        return new BigDecimal(price.intValue()*num);
    }
}

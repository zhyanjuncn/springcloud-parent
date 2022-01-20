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

/**
 * zyj
 */
@Data
@AllArgsConstructor
@TableName(value = "order",autoResultMap = true)
public class Order implements Serializable {
    ////订单实体类
    private static final long serialVersionUID = -6980009311339814453L;
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * skuId
     */
    private Long skuId;
    /**
     * spuId
     */
    private Long spuId;
    /**
     * 总金额
     */
    private BigDecimal totalMoney;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 计算订单总金额
     * @param price
     * @param num
     * @return
     */
    private BigDecimal getTotal(BigDecimal price,Integer num){
        return new BigDecimal(price.intValue()*num);
    }
}

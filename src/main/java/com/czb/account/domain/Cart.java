package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * zyj
 */
@Data
@AllArgsConstructor
//@TableName(value = "cart",autoResultMap = true)
public class Cart implements Serializable {
    ////购物车实体类
    private static final long serialVersionUID = 312548767024950474L;
    /**
     * id
     */
    //@TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * userId
     */
    private Long userId;
    /**
     * sku集合
     */
    private List<Long> skuIds;
    /**
     * sku集合与数量
     */
    private List<Map<Long,Integer>> cartMap;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}

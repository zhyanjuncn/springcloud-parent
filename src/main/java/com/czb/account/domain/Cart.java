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
@TableName(value = "cart",autoResultMap = true)
public class Cart implements Serializable {
    /**
     * 购物车实体类
     */
    private static final long serialVersionUID = 312548767024950474L;
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private Long userId;
    private List<Long> skuIds;
    private List<Map<Long,Integer>> cartMap;
    private Integer state;
    private Date createTime;
    private Date updateTime;
}

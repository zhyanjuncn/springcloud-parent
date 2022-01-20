package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * zyj
 */
@Data
@Accessors(chain = true)
@TableName(value = "spu",autoResultMap = true)
public class Spu implements Serializable {
    /**
     * 商品spu表
     */
    private static final long serialVersionUID = 6996376042145129388L;
    /**
     * spu id
     */
    @TableId(value = "spu_id",type = IdType.AUTO)
    private Long spuId;
    /**
     * 商品名称
     */
    private String spuName;
    /**
     * 副标题，一般是促销信息
     */
    private String subTitle;
    /**
     * 1级类目id
     */
    private String cid1;
    /**
     * 2级类目id
     */
    private String cid2;
    /**
     * 3级类目id
     */
    private String cid3;
    /**
     * 商品所属分类id
     */
    private Long categoryId;
    /**
     * 商品所属品牌id
     */
    private Long brandId;
    /**
     * 是否上架，0下架，1上架
     */
    private Boolean saleable;
    /**
     * 状态值
     */
    private String state;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}

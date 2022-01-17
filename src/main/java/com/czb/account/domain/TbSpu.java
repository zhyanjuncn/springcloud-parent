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
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "item_spu",autoResultMap = true)
public class TbSpu implements Serializable {


    private static final long serialVersionUID = 6996376042145129388L;
    /**
     * spu id
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * 商品名称
     */
    private String name;
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
     *  商品所属品牌id
     */
    private Long brandId;
    /**
     * 是否上架，0下架，1上架
     */
    private Boolean saleable;
    /**
     * 状态值
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

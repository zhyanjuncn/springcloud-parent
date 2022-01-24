package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * zyj
 */
@Data
@AllArgsConstructor
//@TableName(value = "spu",autoResultMap = true)
public class Spu implements Serializable {
    ////spu实体类
    private static final long serialVersionUID = 6996376042145129388L;
    /**
     * spu id
     */
    //@TableId(value = "id",type = IdType.AUTO)
    private Long id;
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

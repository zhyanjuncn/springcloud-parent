package com.czb.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;

@Data
@AllArgsConstructor
@TableName(value = "item_spu",autoResultMap = true)
public class Spu implements Serializable {//zyj code
    private static final long serialVersionUID = 6996376042145129388L;

    //spuAndId
    @TableId(value = "spu_and_id",type = IdType.AUTO)
    private Long spuAndId;
    //spu名称
    private String name;
    //父id
    private String pid;
    //类型
    private Integer type;
    //状态
    private String state;
    //商品id
    private Long itemId;
    //创建时间
    private Long createTime;
    //更新时间
    private Long updateTime;
}
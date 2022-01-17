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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@TableName(value = "item_spu",autoResultMap = true)
public class ItemSpu implements Serializable {//张三
    private static final long serialVersionUID = 6996376042145129388L;

    //id
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    //spu名称
    private String name;
    //父id
    private String pid;
    //类型
    private String type;
    //状态
    private Integer state;
    //商品id
    private Long itemId;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}
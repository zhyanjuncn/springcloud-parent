package com.czb.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czb.account.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}

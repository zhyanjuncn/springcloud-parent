package com.czb.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czb.account.domain.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<Account> {
}

package com.czb.account.service;

import com.czb.account.domain.Order;

import java.util.List;

public interface OrderService {

    List<Order> selectList();

    Order findById(Long id);
}

package com.regino.dao;

import com.regino.domain.Order;

public interface OrderMapper {

    // 一对一关联查询
    public Order findByIdWithUser(Integer id);
}

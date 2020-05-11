package com.regino.dao;

import com.regino.domain.User;

public interface UserMapper {

    // 一对多关联
    public User findByIdWithOrders(Integer id);

    // 多对多关联1
    public User findByIdWithRoles(Integer id);
}
package com.regino.dao;

import com.regino.domain.Role;

public interface RoleMapper {

    // 多对多关联2
    public Role findByIdWithUsers(Integer id);
}

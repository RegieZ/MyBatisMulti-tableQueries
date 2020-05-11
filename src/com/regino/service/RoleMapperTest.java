package com.regino.service;

import com.regino.dao.RoleMapper;
import com.regino.domain.Role;
import org.junit.Test;

public class RoleMapperTest extends BaseMapperTest {

    // 多对多测试2（根据角色查询用户）
    @Test
    public void test03() throws Exception {
        // 获取代理
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

        Role role = roleMapper.findByIdWithUsers(1);

        System.out.println(role);
    }
}

package com.regino.service;

import com.regino.dao.UserMapper;
import com.regino.domain.User;
import org.junit.Test;

public class UserMapperTest extends BaseMapperTest {

    // 一对多测试
    @Test
    public void test01() throws Exception {
        // 获取代理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findByIdWithOrders(41);

        System.out.println(user);
    }

    // 多对多测试1（根据用户查询角色）
    @Test
    public void test02() throws Exception {
        // 获取代理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findByIdWithRoles(41);

        System.out.println(user);
    }
}
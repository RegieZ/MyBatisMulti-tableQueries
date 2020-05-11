package com.regino.service;

import com.regino.dao.OrderMapper;
import com.regino.domain.Order;
import org.junit.Test;

public class OrderMapperTest extends BaseMapperTest { // 继承父类，就可以直接使用 父类的方法和成员变量了

    // 一对一关联测试
    @Test
    public void test01() throws Exception {
        // 获取代理对象
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        // 根据id查询
        Order order = orderMapper.findByIdWithUser(1);
        System.out.println(order);
    }
}
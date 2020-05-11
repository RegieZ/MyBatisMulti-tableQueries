package com.regino.service;

import com.regino.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

public class BaseMapperTest {

    protected SqlSession sqlSession = null;

    // 此方法在测试方法执行之前，执行
    @Before
    public void before() {
        // 获取sqlSession对象
        sqlSession = MyBatisUtils.openSession();// 此方法必须线程内独享....
    }

    // 此方法在测试地方法执行之后，执行
    @After
    public void after() {
        // 关闭sqlSession
        MyBatisUtils.close(sqlSession);
    }
}
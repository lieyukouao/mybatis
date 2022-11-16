package com.lieyukou.mybatis.test;

import com.lieyukou.mybatis.mapper.DynamicSQLMapper;
import com.lieyukou.mybatis.pojo.Emp;
import com.lieyukou.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicSQLMapperTest {
    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empCondition = mapper.getEmpCondition(new Emp(null, "张三", 12, "男", "123451@qq.com"));
        System.out.println(empCondition);
    }

    @Test
    public void testGetEmpDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.deleteMpreByArray(new Integer[]{6,7,8});
        System.out.println(i);

    }
}

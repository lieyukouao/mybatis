package com.lieyukou.mybatis.test;

import com.lieyukou.mybatis.mapper.CacheMapper;
import com.lieyukou.mybatis.pojo.Emp;
import com.lieyukou.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CacheMapperTest {
    @Test
    public void testCahce(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empByEid = mapper.getEmpByEid(1);
        System.out.println(empByEid);
    }
}

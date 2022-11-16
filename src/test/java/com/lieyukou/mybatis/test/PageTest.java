package com.lieyukou.mybatis.test;

import com.github.pagehelper.PageHelper;
import com.lieyukou.mybatis.mapper.SelectMapper;
import com.lieyukou.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Map;

public class PageTest {
    @Test
    public void testHelperTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        PageHelper.startPage(1,1);
        Map<String, Object> allUserToMap = mapper.getAllUserToMap();

        System.out.println(allUserToMap);
    }
}

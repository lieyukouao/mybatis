package com.lieyukou.mybatis.mapper;

import com.lieyukou.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 多条件查询
     */
    List<Emp> getEmpCondition(Emp emp);
    /**
     * 通过数组来进行批量删除
     */
    int deleteMpreByArray(@Param("eids") Integer[] eids);
}

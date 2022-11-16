package com.lieyukou.mybatis.mapper;

import com.lieyukou.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp getEmpByEid(@Param("eid") Integer eid);
}

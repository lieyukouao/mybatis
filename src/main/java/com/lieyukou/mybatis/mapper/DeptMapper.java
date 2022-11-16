package com.lieyukou.mybatis.mapper;

import com.lieyukou.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);
    /**
     * 获取部门以及部门中所有员工信息
     */
    Dept getDeptAndEmp(@Param("did") Integer did);
    /**
     * 通过分布查询部门以及部门中所有员工的信息
     */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}

package com.lieyukou.mybatis.mapper;

import com.lieyukou.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    List<User> getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> getAllUser();
    /**
     * 查询用户的总记录数
     */
    Integer getCount();
    /**
     * 根据id查询用户信息为一个map集合
     * @param id
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);
    /**
     * 查询所有用户为一个map集合
     */
    @MapKey("id")
    Map<String,Object> getAllUserToMap();

}


package com.lieyukou.mybatis.mapper;

import com.lieyukou.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int insertUser();
    void updateUser();
    void deleteUser();
    User getUserById32();
    List<User> getAllUser();
    User getUserByUsername(String username);
    User checkLogin(String username, String password);
    /**
     * 验证登入参数为map
     */
    User  checkLoginByMap(Map<String, Object> map);
    /**
     * 添加用户信息
     */
    int insertUser2(User user);
    /**
     * 验证登入使用@parm注解
     */
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}

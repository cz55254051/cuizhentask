package com.chatRobot.service;

import com.chatRobot.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUser(@Param("name")String name, @Param("status")Boolean status);

}

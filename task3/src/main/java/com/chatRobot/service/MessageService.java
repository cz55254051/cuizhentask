package com.chatRobot.service;

import com.chatRobot.model.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> selectMessage(@Param("workId")Integer workId, @Param("status")Boolean status);
}

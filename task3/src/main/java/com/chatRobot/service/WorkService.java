package com.chatRobot.service;

import com.chatRobot.model.Work;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkService {

    int deleteByPrimaryKey(Integer id);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);

    List<Work> selectWork(@Param("name")String name, @Param("status")Boolean status);
}

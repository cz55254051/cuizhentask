package com.chatRobot.service;

import com.chatRobot.model.Classify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassifyService {
    int deleteByPrimaryKey(Integer id);

    int insert(Classify record);

    int insertSelective(Classify record);

    Classify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);

    List<Classify> selectClassify(@Param("name")String name, @Param("status")Boolean status);

}

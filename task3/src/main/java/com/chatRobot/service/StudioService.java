package com.chatRobot.service;

import com.chatRobot.model.Studio;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudioService {
    int deleteByPrimaryKey(Integer id);

    int insert(Studio record);

    int insertSelective(Studio record);

    Studio selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKey(Studio record);

    List<Studio> selectStudio(@Param("name")String name, @Param("status")Boolean status);
}

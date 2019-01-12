package com.chatRobot.dao;

import com.chatRobot.model.Banner;
import com.chatRobot.model.Studio;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudioMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studio record);

    int insertSelective(Studio record);

    Studio selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKey(Studio record);

    List<Studio> selectStudio(@Param("name")String name, @Param("status")Boolean status);
}
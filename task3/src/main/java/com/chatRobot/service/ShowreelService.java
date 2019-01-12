package com.chatRobot.service;

import com.chatRobot.model.Showreel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShowreelService {
    int deleteByPrimaryKey(Integer id);

    int insert(Showreel record);

    int insertSelective(Showreel record);

    Showreel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Showreel record);

    int updateByPrimaryKey(Showreel record);

    List<Showreel> selectShowreel(@Param("name")String name, @Param("status")Boolean status);
}

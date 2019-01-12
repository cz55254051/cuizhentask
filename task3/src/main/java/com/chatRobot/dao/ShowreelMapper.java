package com.chatRobot.dao;

import com.chatRobot.model.Banner;
import com.chatRobot.model.Showreel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShowreelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Showreel record);

    int insertSelective(Showreel record);

    Showreel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Showreel record);

    int updateByPrimaryKey(Showreel record);

    List<Showreel> selectShowreel(@Param("name")String name, @Param("status")Boolean status);

}
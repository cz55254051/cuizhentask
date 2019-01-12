package com.chatRobot.dao;

import com.chatRobot.model.Banner;
import com.chatRobot.model.Replay;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Replay record);

    int insertSelective(Replay record);

    Replay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Replay record);

    int updateByPrimaryKey(Replay record);

    List<Replay> selectReplay(Replay record);

}
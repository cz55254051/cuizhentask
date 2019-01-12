package com.chatRobot.service;

import com.chatRobot.model.Replay;

import java.util.List;

public interface ReplayService {
    int deleteByPrimaryKey(Integer id);

    int insert(Replay record);

    int insertSelective(Replay record);

    Replay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Replay record);

    int updateByPrimaryKey(Replay record);

    List<Replay> selectReplay(Replay record);
}

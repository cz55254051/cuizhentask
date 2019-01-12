package com.chatRobot.service.impl;

import com.chatRobot.dao.BannerMapper;
import com.chatRobot.dao.ReplayMapper;
import com.chatRobot.model.Replay;
import com.chatRobot.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplayServiceImpl implements ReplayService {
    @Autowired
    private ReplayMapper replayMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return replayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Replay record) {
        return replayMapper.insert(record);
    }

    @Override
    public int insertSelective(Replay record) {
        return replayMapper.insertSelective(record);
    }

    @Override
    public Replay selectByPrimaryKey(Integer id) {
        return replayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Replay record) {
        return replayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Replay record) {
        return replayMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Replay> selectReplay(Replay record) {
        return replayMapper.selectReplay(record);
    }
}

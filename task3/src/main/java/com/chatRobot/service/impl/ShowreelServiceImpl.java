package com.chatRobot.service.impl;

import com.chatRobot.dao.ShowreelMapper;
import com.chatRobot.model.Showreel;
import com.chatRobot.service.ShowreelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowreelServiceImpl implements ShowreelService {
    @Autowired
    private ShowreelMapper showreelMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return showreelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Showreel record) {
        return showreelMapper.insert(record);
    }

    @Override
    public int insertSelective(Showreel record) {
        return showreelMapper.insertSelective(record);
    }

    @Override
    public Showreel selectByPrimaryKey(Integer id) {
        return showreelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Showreel record) {
        return showreelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Showreel record) {
        return showreelMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Showreel> selectShowreel(String name, Boolean status) {
        return showreelMapper.selectShowreel(name, status);
    }
}

package com.chatRobot.service.impl;

import com.chatRobot.dao.StudioMapper;
import com.chatRobot.model.Studio;
import com.chatRobot.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioServiceImpl implements StudioService {
@Autowired
    private StudioMapper studioMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studioMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Studio record) {
        return studioMapper.insert(record);
    }

    @Override
    public int insertSelective(Studio record) {
        return studioMapper.insertSelective(record);
    }

    @Override
    public Studio selectByPrimaryKey(Integer id) {
        return studioMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Studio record) {
        return studioMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Studio record) {
        return studioMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Studio> selectStudio(String name, Boolean status) {
        return studioMapper.selectStudio(name, status);
    }
}

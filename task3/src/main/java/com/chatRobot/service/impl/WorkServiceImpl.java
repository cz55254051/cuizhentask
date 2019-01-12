package com.chatRobot.service.impl;

import com.chatRobot.dao.WorkMapper;
import com.chatRobot.model.Work;
import com.chatRobot.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
@Autowired
    private WorkMapper workMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return workMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Work record) {
        return workMapper.insert(record);
    }

    @Override
    public int insertSelective(Work record) {
        return workMapper.insertSelective(record);
    }

    @Override
    public Work selectByPrimaryKey(Integer id) {
        return workMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Work record) {
        return workMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Work record) {
        return workMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Work> selectWork(String name, Boolean status) {
        return workMapper.selectWork(name, status);
    }
}

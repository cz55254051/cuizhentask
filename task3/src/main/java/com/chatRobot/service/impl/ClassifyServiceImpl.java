package com.chatRobot.service.impl;

import com.chatRobot.dao.ClassifyMapper;
import com.chatRobot.model.Classify;
import com.chatRobot.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private ClassifyMapper classifyMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) { return classifyMapper.deleteByPrimaryKey(id); }
    @Override
    public int insert(Classify record) { return classifyMapper.insert(record); }
    @Override
    public int insertSelective(Classify record) { return classifyMapper.insertSelective(record); }
    @Override
    public Classify selectByPrimaryKey(Integer id) { return classifyMapper.selectByPrimaryKey(id); }
    @Override
    public int updateByPrimaryKeySelective(Classify record) { return classifyMapper.updateByPrimaryKeySelective(record); }
    @Override
    public int updateByPrimaryKey(Classify record) { return classifyMapper.updateByPrimaryKey(record); }
    @Override
    public List<Classify> selectClassify(String name, Boolean status) { return classifyMapper.selectClassify(name, status); }
}

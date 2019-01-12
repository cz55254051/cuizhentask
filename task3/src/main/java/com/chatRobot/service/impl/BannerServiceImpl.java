package com.chatRobot.service.impl;

import com.chatRobot.dao.BannerMapper;
import com.chatRobot.model.Banner;
import com.chatRobot.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bannerMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int insert(Banner record) { return bannerMapper.insert(record); }
    @Override
    public int insertSelective(Banner record) {
        return bannerMapper.insertSelective(record);
    }
    @Override
    public Banner selectByPrimaryKey(Integer id) {
        return bannerMapper.selectByPrimaryKey(id);
    }
    @Override
    public int updateByPrimaryKeySelective(Banner record) {
        return bannerMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int updateByPrimaryKey(Banner record) {
        return bannerMapper.updateByPrimaryKey(record);
    }
    @Override
    public List<Banner> selectBanner(String copyreaderv, Boolean status) {
        return bannerMapper.selectBanner(copyreaderv, status);
    }

}

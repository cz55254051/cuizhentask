package com.chatRobot.service;

import com.chatRobot.model.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerService {

    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);

    List<Banner> selectBanner(@Param("copyreader")String copyreaderv, @Param("status")Boolean status);
}

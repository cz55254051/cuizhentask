package com.chatRobot.dao;

import com.chatRobot.model.Banner;
import com.chatRobot.model.Classify;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classify record);

    int insertSelective(Classify record);

    Classify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);

    List<Classify> selectClassify(@Param("name")String name, @Param("status")Boolean status);
}
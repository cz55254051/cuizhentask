package com.chatRobot.controller;


import com.chatRobot.model.Studio;
import com.chatRobot.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class StudioController {
    private static Logger logger = Logger.getLogger(String.valueOf(StudioController.class));

    @Autowired
    StudioService studioService;

    @RequestMapping(value = "/Studios",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> selectStudio(@RequestParam(value = "name",required = false)String name,
                                           @RequestParam(value = "status",required = false)boolean status){
        logger.info(name);
        logger.info(String.valueOf(status));
        Map<String,Object> map=new HashMap<String, Object>();
        List<Studio> studioList=studioService.selectStudio(name,status);
        if (studioList==null||studioList.size()==0){
            map.put("code","100");
            map.put("message","查询失败");
            map.put("data","无法找到");
        }else {
            map.put("code","200");
            map.put("message","查询成功");
            map.put("data",studioList);
        }
        logger.info("查询结果："+studioList);
        return map;
    }
    @RequestMapping(value = "/Studios",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertStudio(Studio record) {
        logger.info("添加数据" + record);
        Map<String, Object> map = new HashMap<String, Object>();
        int x = studioService.insertSelective(record);
        logger.info("结果" + String.valueOf(x));
        if (x == 0) {
            map.put("code", "100");
            map.put("meaaage", "插入失败");
        } else {
            map.put("code", "200");
            map.put("code", "插入成功");
        }
        return map;

    }


    @RequestMapping(value = "/Studios/{id}",method =RequestMethod.PUT)
    @ResponseBody
    public Map<String,Object> updateStudio(@PathVariable Integer id,Studio record){
        logger.info("更新数据"+String.valueOf(record));
        logger.info("更新id"+String.valueOf(id));
        Map<String, Object> map = new HashMap<String, Object>();
        int x = studioService.updateByPrimaryKey(record);
        logger.info("结果" + String.valueOf(x));
        if (x == 0) {
            map.put("code", "100");
            map.put("meaaage", "更新失败");
        } else {
            map.put("code", "200");
            map.put("code", "更新成功");
        }
        return map;
    }
    @RequestMapping(value = "/Studios/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> deleteStudio(@PathVariable Integer id){
        logger.info("删除数据id"+id);
        Map<String,Object> map=new HashMap<String, Object>();
        int x = studioService.deleteByPrimaryKey(id);
        if (x == 0) {
            map.put("code", "100");
            map.put("meaaage", "删除失败");
        } else {
            map.put("code", "200");
            map.put("code", "删除成功");
        }
        return map;
    }
    
    
    
}

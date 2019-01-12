package com.chatRobot.controller;



import com.chatRobot.model.Showreel;
import com.chatRobot.service.ShowreelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class ShowreelController {
    private static Logger logger = Logger.getLogger(String.valueOf(ShowreelController.class));

    @Autowired
    ShowreelService showreelService;

    @RequestMapping(value = "/Showreels",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> selectShowreel(@RequestParam(value = "name",required = false)String name,
                                             @RequestParam(value = "status",required = false)boolean status){
        logger.info(name);
        logger.info(String.valueOf(status));
        Map<String,Object> map=new HashMap<String, Object>();
        List<Showreel> showreelList=showreelService.selectShowreel(name,status);
        if (showreelList==null||showreelList.size()==0){
            map.put("code","100");
            map.put("message","查询失败");
            map.put("data","无法找到");
        }else {
            map.put("code","200");
            map.put("message","查询成功");
            map.put("data",showreelList);
        }
        logger.info("查询结果："+showreelList);
        return map;
    }
    @RequestMapping(value = "/Showreels",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertShowreel(Showreel record) {
        logger.info("添加数据" + record);
        Map<String, Object> map = new HashMap<String, Object>();
        int x = showreelService.insertSelective(record);
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


    @RequestMapping(value = "/Showreels/{id}",method =RequestMethod.PUT)
    @ResponseBody
    public Map<String,Object> updateShowreel(@PathVariable Integer id,Showreel record){
        logger.info("更新数据"+String.valueOf(record));
        logger.info("更新id"+String.valueOf(id));
        Map<String, Object> map = new HashMap<String, Object>();
        int x = showreelService.updateByPrimaryKey(record);
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
    @RequestMapping(value = "/Showreels/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> deleteShowreel(@PathVariable Integer id){
        logger.info("删除数据id"+id);
        Map<String,Object> map=new HashMap<String, Object>();
        int x = showreelService.deleteByPrimaryKey(id);
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

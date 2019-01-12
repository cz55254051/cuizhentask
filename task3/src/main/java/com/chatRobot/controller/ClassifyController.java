package com.chatRobot.controller;



import com.chatRobot.model.Classify;
import com.chatRobot.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller

public class ClassifyController {
    private static Logger logger = Logger.getLogger(String.valueOf(ClassifyController.class));

    @Autowired
    ClassifyService classifyService;

    @RequestMapping(value = "/Classifys",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> selectClassify(@RequestParam(value = "name",required = false)String name,
                                           @RequestParam(value = "status",required = false)boolean status){
        logger.info(name);
        logger.info(String.valueOf(status));
        Map<String,Object> map=new HashMap<String, Object>();
        List<Classify> ClassifyList=classifyService.selectClassify(name,status);
        if (ClassifyList==null||ClassifyList.size()==0){
            map.put("code","100");
            map.put("message","查询失败");
            map.put("data","无法找到");
        }else {
            map.put("code","200");
            map.put("message","查询成功");
            map.put("data",ClassifyList);
        }
        logger.info("查询结果："+ClassifyList);
        return map;
    }

    @RequestMapping(value = "/Classifys",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertClassify(Classify record) {
        logger.info("添加数据" + record);
        Map<String, Object> map = new HashMap<String, Object>();
        int x = classifyService.insertSelective(record);
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


    @RequestMapping(value = "/Classifys/{id}",method =RequestMethod.PUT)
    @ResponseBody
    public Map<String,Object> updateClassify(@PathVariable Integer id,Classify record){
        logger.info("更新数据"+String.valueOf(record));
        logger.info("更新id"+String.valueOf(id));
        Map<String, Object> map = new HashMap<String, Object>();
        int x = classifyService.updateByPrimaryKey(record);
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
    @RequestMapping(value = "/Classifys/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> deleteClassify(@PathVariable Integer id){
        logger.info("删除数据id"+id);
        Map<String,Object> map=new HashMap<String, Object>();
        int x = classifyService.deleteByPrimaryKey(id);
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

package com.chatRobot.controller;


import com.chatRobot.model.Message;
import com.chatRobot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class MessageController {
    private static Logger logger = Logger.getLogger(String.valueOf(MessageController.class));
    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/Messages",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> selectMessage(@RequestParam(value = "workId",required = false)Integer workId,
                                            @RequestParam(value = "status",required = false)boolean status){
        logger.info(String.valueOf(workId));
        logger.info(String.valueOf(status));
        Map<String,Object> map=new HashMap<String,Object>();
        List<Message> messageList=messageService.selectMessage(workId,status);
        if (messageList==null||messageList.size()==0){
            map.put("code","100");
            map.put("message","查询失败");
            map.put("data","无法找到");
        }else {
            map.put("code","200");
            map.put("message","查询成功");
            map.put("data",messageList);
        }
        logger.info("查询结果："+messageList);
        return map;
    }
    @RequestMapping(value = "/Messages",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertMessage(Message record) {
        logger.info("添加数据" + record);
        Map<String, Object> map = new HashMap<String, Object>();
        int x = messageService.insertSelective(record);
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


    @RequestMapping(value = "/Messages/{id}",method =RequestMethod.PUT)
    @ResponseBody
    public Map<String,Object> updateMessage(@PathVariable Integer id,Message record){
        logger.info("更新数据"+String.valueOf(record));
        logger.info("更新id"+String.valueOf(id));
        Map<String, Object> map = new HashMap<String, Object>();
        int x = messageService.updateByPrimaryKey(record);
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
    @RequestMapping(value = "/Messages/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> deleteMessage(@PathVariable Integer id){
        logger.info("删除数据id"+id);
        Map<String,Object> map=new HashMap<String, Object>();
        int x = messageService.deleteByPrimaryKey(id);
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








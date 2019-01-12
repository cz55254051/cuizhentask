package com.chatRobot.controller;


import com.chatRobot.model.Replay;
import com.chatRobot.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


@Controller
public class ReplayController {
    private static Logger logger = Logger.getLogger(String.valueOf(ReplayController.class));
    @Autowired
    ReplayService replayService;

    @RequestMapping(value = "/Replays",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, java.lang.Object> insertreplay(Replay record) {
        logger.info("添加数据" + record);
        Map<String, java.lang.Object> map = new HashMap<String, Object>();
        int x = replayService.insertSelective(record);
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

    @RequestMapping(value = "/Replays/{id}",method =RequestMethod.PUT)
    @ResponseBody
    public Map<String,Object> updatereplay(@PathVariable Integer id,Replay record){
        logger.info("更新数据"+String.valueOf(record));
        logger.info("更新id"+String.valueOf(id));
        Map<String, Object> map = new HashMap<String, Object>();
        int x = replayService.updateByPrimaryKey(record);
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
    @RequestMapping(value = "/Replays/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> deletereplay(@PathVariable Integer id){
        logger.info("删除数据id"+id);
        Map<String,Object> map=new HashMap<String, Object>();
        int x = replayService.deleteByPrimaryKey(id);
        if (x == 0) {
            map.put("code", "100");
            map.put("meaaage", "删除失败");
        } else {
            map.put("code", "200");
            map.put("code", "删除成功");
        }
        return map;
    }

    @RequestMapping(value = "/Replays",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> selectReplay(Replay record){
        Map<String,Object> map=new HashMap<String, Object>();
        List<Replay> replayList=replayService.selectReplay(record);
        if(replayList==null||replayList.size()==0){
            map.put("code","100");
            map.put("message","查询失败");
            map.put("data","无法找到");
        }else{
            map.put("code","200");
            map.put("message","查询成功");
            map.put("data",replayList);
        }
        logger.info("查询结果"+replayList);
        return map;
    }
    
}

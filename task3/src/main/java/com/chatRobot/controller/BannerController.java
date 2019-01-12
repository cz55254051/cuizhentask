package com.chatRobot.controller;

import com.chatRobot.model.Banner;
import com.chatRobot.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class BannerController {
    private static Logger logger = Logger.getLogger(String.valueOf(BannerController.class));

    @Autowired
    BannerService bannerService;

    @RequestMapping(value = "/Banners",method = RequestMethod.GET)
    @ResponseBody
   public Map<String,Object> selectBanner(@RequestParam(value = "copyreaderv",required = false)String copyreaderv,
    @RequestParam(value = "status",required = false)boolean status){

        logger.info(copyreaderv);
        logger.info(String.valueOf(status));
        Map<String,Object> map=new HashMap<String, Object>();
        List<Banner> bannerList=bannerService.selectBanner(copyreaderv,status);
        if (bannerList==null||bannerList.size()==0){
            map.put("code","100");
            map.put("message","查询失败");
            map.put("data","无法找到");
        }else {
            map.put("code","200");
            map.put("message","查询成功");
            map.put("data",bannerList);
        }
        logger.info("查询结果："+bannerList);
        return map;
    }
    @RequestMapping(value = "/Banners",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertBanner(Banner record) {
        logger.info("添加数据" + record);
        Map<String, Object> map = new HashMap<String, Object>();
        int x = bannerService.insertSelective(record);
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


        @RequestMapping(value = "/Banners/{id}",method =RequestMethod.PUT)
        @ResponseBody
        public Map<String,Object> updateBanner(@PathVariable Integer id,Banner record){
        logger.info("更新数据"+String.valueOf(record));
        logger.info("更新id"+String.valueOf(id));
            Map<String, Object> map = new HashMap<String, Object>();
            int x = bannerService.updateByPrimaryKey(record);
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
    @RequestMapping(value = "/Banners/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> deleteBanner(@PathVariable(value = "id") Integer id){

        logger.info("删除数据id"+id);
        Map<String,Object> map=new HashMap<String, Object>();
        int x = bannerService.deleteByPrimaryKey(id);
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

package com.atguigu.gmall2019.logger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName LoggerController
 * @Description TODO
 * @Author Zhang Hongxiang
 * @Date 2020/3/3 1:09
 * @Version 1.0
 **/
@RestController
@Slf4j
public class LoggerController {
   // @RequestMapping(value = "log",method = RequestMethod.POST)
    @PostMapping("log")
   //@ResponseBody
    public String dolog(@RequestParam("logString") String logString){
        System.out.println(logString);
        //落盘日志   实现类：log4j 、logback 、log4j2 、loging --》接口 slf4j
        log.info(logString);
        return "success";


    }
}

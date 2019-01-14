package top.heysunday.myblog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.heysunday.myblog.model.Hello;
import top.heysunday.myblog.service.HelloService;

import java.util.Map;

@Controller
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;
    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("----------------hahaha-----------------");
        Hello helo = helloService.getHelloMessage(1);
        System.out.println("查询完毕------>"+helo.toString());
        logger.trace("这是trance-----");
        logger.debug("debug进来了吗-----");
        logger.info("info进来了吗------");
        logger.warn("warn进来了吗-----");
        logger.error("error进来了吗-----");
        return helo.toString();
    }
    @RequestMapping("/hi")
    public  String hi(Map<String,String> mp){
        mp.put("hello","你好o");
        return "test/hi";
    }
}

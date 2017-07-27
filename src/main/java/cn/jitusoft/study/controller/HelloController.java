package cn.jitusoft.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloController {

    // 添加日志
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/index")
    public String index(){
        logger.info("第一页面");
        return "index";
    }
}

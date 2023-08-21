package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //方法的返回结果自动转json
public class IndexController {

    //只有前端发送get请求  并且路径是/index的时候,才会进入此方法
    @GetMapping("/index")
    public String index() {
        return "hello, springboot!";
    }
}
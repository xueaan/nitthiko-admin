package com.nitthiko.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nitthiko.domain.dto.UserCreateParam;
import com.nitthiko.result.Result;
import jakarta.validation.Valid;



/**
 * 测试控制器
 */
@RestController
public class HelloWorldController {
    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    /**
     * 测试接口
     * @return 测试数据
     */
    @GetMapping("/hello")
    public  Result<String> hello() {
        logger.info("HelloWorldController init");
        
        return Result.success("Hello World","系统启动成功");
    }

    @PostMapping("/user/create")
    public Result<String> createUser(@RequestBody @Valid UserCreateParam param){
       // 正常情况返回成功
       return Result.success("创建用户成功：" + param.getUsername());
    }
}
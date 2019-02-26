package com.nding.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("hi")
    public String sayHi(@RequestParam("name") String userName) {
        return "Hi, " + userName;
    }

    @RequestMapping("adduser")
    public String addUser(@RequestParam("name") String userName) {
        redisTemplate.opsForList().leftPush("user_list", userName);
        return "ok";
    }
}

package com.nding.learn.controller;

import com.google.common.collect.Maps;
import com.nding.learn.po.User;
import com.nding.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "add", name = "添加用户")
    public Map<String, Object> add(@RequestBody(required = false) User user) {
        long userId = userService.addUser(user);
        Map<String, Object> data = Maps.newHashMap();
        data.put("userId", userId);
        return data;

    }

    @GetMapping(value = "list", name = "查询用户列表")
    public Map<String, Object> selectList() {
        List<User> list = userService.selectList();
        Map<String, Object> data = Maps.newHashMap();
        data.put("list", list);
        return data;

    }

    @GetMapping(value = "select", name = "查询单个用户")
    public User select(@RequestParam("id") long userId) {
        return userService.select(userId);

    }
}

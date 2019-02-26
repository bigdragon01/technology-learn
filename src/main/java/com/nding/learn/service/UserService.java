package com.nding.learn.service;

import com.alibaba.fastjson.JSON;
import com.nding.learn.mapper.UserMapper;
import com.nding.learn.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public long addUser(User user) {
        log.info("add user, params:{}", JSON.toJSONString(user));
        userMapper.insert(user);
        return user.getId();
    }

    public List<User> selectList() {
        return userMapper.selectList();
    }

    public User select(long id) {
        return userMapper.select(id);
    }
}

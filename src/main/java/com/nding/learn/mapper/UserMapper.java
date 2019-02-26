package com.nding.learn.mapper;

import com.nding.learn.po.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserMapper {
    void insert(User user);

    List<User> selectList();

    User select(@Param("id") long id);

}

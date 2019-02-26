package com.nding.learn.po;

import lombok.Data;

import java.util.Date;

/**
 * 秒杀商品实体类，对应的表名为seckill
 */
@Data
public class User {
    private long id;

    private String name;

    private int age;

    private String email;

    private Date ctime;

    private Date mtime;
}

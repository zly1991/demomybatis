package com.dzhou.controller;

import com.dzhou.entity.User;
import com.dzhou.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ZHOULY2 on 2019-6-1.
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserMapper mapper;

    @RequestMapping("/list")
    public List<User> listuser(){
        log.info("in controller {}{}",1,1);
       return this.mapper.queryUsers();
    }
}

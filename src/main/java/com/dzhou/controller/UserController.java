package com.dzhou.controller;

import com.dzhou.dao.UserDao;
import com.dzhou.entity.User;
import com.dzhou.mapper.UserMapper;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

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
    @Autowired
    private UserDao userDao;

    @RequestMapping(path="/list",method = RequestMethod.GET)
    public List<User> listuser(){
        log.info("in controller {}{}",1,1);
       return this.mapper.queryUsers();
    }
    @PostMapping("/update")
    public String updateUser(@RequestBody User u){
       int x= this.userDao.updateByPrimaryKeySelective(u);
//        int x= this.userDao.updateByPrimaryKey(u);
       log.info(x+"");
        return "success";
    }
    @PostMapping("/addUser")
    public String insertUser(@RequestBody User u){
        this.userDao.insert(u);
        return  "success";
    }
    @DeleteMapping("delete")
    public String deleteUser(@RequestBody long id){
        User u=new User();
        u.setId(Long.valueOf(id).intValue());
        this.userDao.deleteByPrimaryKey(u);
        return "success";
    }
}

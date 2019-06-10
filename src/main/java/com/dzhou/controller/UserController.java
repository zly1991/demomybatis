package com.dzhou.controller;

import com.dzhou.dao.TBdRoleDao;
import com.dzhou.dao.UserDao;
import com.dzhou.entity.TBdRole;
import com.dzhou.entity.TBdUser;
import com.dzhou.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private TBdRoleDao roleDao;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public List<TBdUser> listuser() {
        log.info("in controller {}{}", 1, 1);
        return this.mapper.queryUsers();
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody TBdUser u) {
        int x = this.userDao.updateByPrimaryKeySelective(u);
//        int x= this.userDao.updateByPrimaryKey(u);
        log.info(x + "");
        return "success";
    }

    @PostMapping("/addUser")
    public String insertUser(@RequestBody TBdUser u) {
        this.userDao.insert(u);
        return "success";
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody long id) {
        TBdUser u = new TBdUser();
        u.setId(Long.valueOf(id).intValue());
        this.userDao.deleteByPrimaryKey(u);
        return "success";
    }
    //user的一对多，一对一方法

    public TBdUser selectUser(@PathVariable long id) {
        return this.userDao.selectByPrimaryKey(id);
    }

    @PostMapping("/userRole/{id}")
    public TBdUser selectUserRole(@PathVariable long id) {
        return this.userDao.queryUserRoleId(id);
    }
    @PostMapping("/userinfo/{id}")
   public TBdUser selectUserInfo(@PathVariable(name="id") long userid){
        return this.userDao.queryUserInfo(userid);

   }

    //role的方法
    @PostMapping("/role/{userid}")
    public List<TBdRole> selectRole(@PathVariable long userid) {
        return this.roleDao.selectTBdRoleByUserId(userid);
    }

    @PostMapping("/role/")
    public List<TBdRole> selectAllRole() {
         return this.roleDao.selectRoles();
    }

}

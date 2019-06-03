package com.dzhou.test;

import com.dzhou.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.*;

/**
 * Created by ZHOULY2 on 2019-6-1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
     private UserMapper userMapper;
    @Test
    public void queryUsers() throws Exception {
        Assert.notEmpty( this.userMapper.queryUsers(),"123" );

    }
}
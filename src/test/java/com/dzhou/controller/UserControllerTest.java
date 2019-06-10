package com.dzhou.controller;

import com.dzhou.tool.PageDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ZHOULY2 on 2019-6-1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserControllerTest {
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    @Autowired
    private UserController userController;
    @Before
    public void setUp() throws Exception {
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void listuser() throws Exception {
        PageDTO page = new PageDTO();
        page.setPagenum(1);
        page.setPagesize(1);
        log.info("打印{}", userController.listuser(page).toString());
    }
}
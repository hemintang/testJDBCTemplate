package com.xm4399.controller;

import com.xm4399.dao.UserDao;
import com.xm4399.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hemintang on 17-3-24.
 */
@Controller
public class UserController {

    @Autowired
    private UserDao userDao;
    @RequestMapping("register")
    @ResponseBody
    public String register(User user){
        userDao.save(user);
        return "successful";
    }
}

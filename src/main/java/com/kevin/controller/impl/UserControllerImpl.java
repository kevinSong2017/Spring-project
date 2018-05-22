package com.kevin.controller.impl;
import com.kevin.controller.UserController;
import com.kevin.entity.User;
import com.kevin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("uc")
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping("getUser")
    public User getUser(int id) {
        return userService.getUser(id);
    }
}

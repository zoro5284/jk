package com.jk.controller.test;

import com.jk.pojo.User;
import com.jk.testMapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapperTest {
    @Autowired
    TestMapper testMapper;

    @RequestMapping("/testmapper")
    @ResponseBody
    public User findU(String phone){
        System.out.println("dfhasjhfalksjdhf kas ");
        System.out.println(phone);
        User user = testMapper.findUser(phone);
        System.out.println("-------------------------------------");
        System.out.println(user);
        System.out.println(user.getUserId());
        System.out.println(user.getName());
        return user;
    }
 }

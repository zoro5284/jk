package com.jk.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.Format;
import java.util.Date;

@Controller
public class TestBean {
    @RequestMapping("/hellotest")
//    @ResponseBody
    public String helloTest(String id,String name){
        System.out.println("id="+id+"name="+name);
        System.out.println("nihoa,shijie");
        return "/hello.html";



    }
}

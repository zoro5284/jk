package com.jk.controller.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
@Configuration
public class HelloTest {
   @Bean
    public TestBean testBean(){
       return new TestBean();
    }
}

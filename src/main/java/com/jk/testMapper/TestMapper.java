package com.jk.testMapper;

import com.jk.pojo.User;
import org.springframework.stereotype.Component;


public interface TestMapper {
    public User findUser(String phone);
}

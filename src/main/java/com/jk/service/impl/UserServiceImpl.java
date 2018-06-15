package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.pojo.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public Map login(String phone,String password) {
        User user = userMapper.login(phone);
//        System.out.println("阿斯蒂芬阿斯蒂芬阿斯蒂芬艾斯范德萨范德萨"+user.getPassword());
        Integer loginState = null;//1表示成功登陆，2表示不存在该用户，3表示密码错误
        if(user!=null){
            if(user.getPassword().equals(password)){

                loginState=1;
            }else{
                loginState=3;
            }
        }else{
            loginState=2;
        }
        Map map = new HashMap();
        map.put("user",user);
        map.put("state",loginState);
        return map;
    }
}

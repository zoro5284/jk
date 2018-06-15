package com.jk.service;

import com.jk.pojo.User;

import java.util.Map;

public interface UserService {
    public Map login(String phone, String password);
}

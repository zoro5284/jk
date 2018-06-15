package com.jk.controller.user;

import com.jk.pojo.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/fmain.action")
//    public String login(Model model,String phone, String password){
//        System.out.println("加适量的积分；拉可适当啊水力发电会计法；啊了手术砥砺奋进"+phone);
//        Map map = userService.login(phone,password);
////        User user = (User) map.get("user");
//        Integer state = (Integer)map.get("state");
//        System.out.println("大实践活动发送快递放假阿斯利康大姐夫拉斯科技"+state);
//        if(state==1){
//            return "/home/fmain.jsp";
//        }else if (state==2){
////            model.addAttribute("state","不存在该用户");
//            model.addAttribute("state",state);
//            return "/index.jsp";
//        }else{
////            model.addAttribute("state","用户名或密码错误");
//            model.addAttribute("state",state);
//            return "/index.jsp";
//        }
//
//    }

@RequestMapping(value = "/fmain.action", method = RequestMethod.POST)
@ResponseBody
public Map login(@RequestBody  User user){
     System.out.println("这是用ajax从页面传过来的数据："+user.getPhone());
     Map map = userService.login(user.getPhone(),user.getPassword());
    return  map;

}

    @RequestMapping("/loginTo.action")
    public String loginTo(){
        return "/home/fmain.jsp";
    }

}

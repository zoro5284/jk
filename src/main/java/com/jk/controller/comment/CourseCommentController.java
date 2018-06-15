package com.jk.controller.comment;

import com.jk.pojo.CourseComment;
import com.jk.pojo.CourseCommentVO;
import com.jk.pojo.User;
import com.jk.service.CourseCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseCommentController {
    @Autowired
    private CourseCommentService service;

//转到评价页面
    @RequestMapping("/comment/toCourseComment.action")
    public String toCourseComment(){
        return "/comment/courseComment/courseComment.html";
    }

//插入用户评价
    @RequestMapping(value = "/comment/courseComment.action",method = RequestMethod.POST)
    @ResponseBody
    public String courseComment(@RequestBody CourseComment courseComment){
        System.out.println("房间爱上了肯德基辜负了；卡戴珊解放路看到阿斯蒂芬撒地方"+courseComment.getComment());
        service.insertComment(courseComment);
//        return "redirect:/pages/comment/courseComment/success.html";
//        HashMap<String, String> map = new HashMap<>();
//        map.put("result", "ok");
//        return map;
        return "ok";
    }
//课程评价列表
    @RequestMapping("/comment/selectCourseCommentList.action")
    public String selectCourseCommentList(Model model){
        List<CourseCommentVO> list = service.selectCourseCommentList();
        System.out.println("=============================================");
        System.out.println(list.size());
        for (CourseCommentVO c:list) {
            System.out.println(c.getClassId());
            System.out.println(c.getCourseName());
            System.out.println(c.getClasss().getId());
            System.out.println(c.getClasss().getTeacherId());
            System.out.println(c.getClasss().getTeacherName());
        }
        model.addAttribute("list",list);
        return "/comment/courseComment/courseCommentList.jsp";
    }
//班级评价列表
    @RequestMapping("/comment/selectClassCommentList.action")
    public String selectClassCommentList(Model model,String classId){
        System.out.println("------------=----------------------------------------");
        System.out.println(classId);
        //查询班级信息
        List<CourseCommentVO> list=service.selectClassCommentList(classId);
        //查询好评人数
        Integer goodNumber = service.selectGoodCommentNumber(classId);
        //查询评价人数
        Integer commentNumber = service.selectCommentNumber(classId);
        for (CourseCommentVO c:list
             ) {
            System.out.println("11111111111111111111111111111111111111");
            System.out.println(c.getClasss().getTeacherName());
            System.out.println(c.getClasss().getClassNumber());

        }
        Map map = new HashMap();
        map.put("list",list);
        map.put("goodNumber",goodNumber);
        map.put("commentNumber",commentNumber);
        model.addAttribute("map",map);
        return "/comment/courseComment/ClassCommentList.jsp";
    }



    @RequestMapping("/comment/selectCommentDetail.action")
    public String selectCommentDetail(Model model,String classId,String userId){
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        System.out.println(classId+"----"+userId);
        String commentDetail = service.selectCommentDetail(classId,userId);
        model.addAttribute("commentDetail",commentDetail);
        return "/comment/courseComment/classCommentDetail.jsp";
    }




}

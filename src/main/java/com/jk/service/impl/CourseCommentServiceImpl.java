package com.jk.service.impl;

import com.jk.mapper.CourseCommentMapper;
import com.jk.pojo.CourseComment;
import com.jk.pojo.CourseCommentVO;
import com.jk.service.CourseCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseCommentServiceImpl implements CourseCommentService {
    @Autowired
    private CourseCommentMapper mapper;

//查询课程评价列表（即最外层评价列表）
    @Override
    public List<CourseCommentVO> selectCourseCommentList() {
        return mapper.selectCourseCommentList();
    }
//查询班级评价列表（第二层评价列表）
    @Override
    public List<CourseCommentVO> selectClassCommentList(String classId) {
        return mapper.selectClassCommentList(classId);
    }
//查询好评人数
    @Override
    public Integer selectGoodCommentNumber(String classId) {
        return mapper.selectGoodCommentNumber(classId);
    }

    //查询班级人数
    @Override
    public Integer selectCommentNumber(String classId) {
        return mapper.selectCommentNumber(classId);
    }


    //查询评价详情


    @Override
    public String selectCommentDetail(String classId, String userId) {
        Map map = new HashMap();
        map.put("classId",classId);
        map.put("userId",userId);
        return mapper.selectCommentDetail(map);
    }

    //插入评价信息
    @Override
    public void insertComment(CourseComment courseComment) {
        System.out.println("大家好，我是索隆"+courseComment.getComment());
        courseComment.setState("1");
        mapper.insertComment(courseComment);
    }


}

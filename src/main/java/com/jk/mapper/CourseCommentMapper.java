package com.jk.mapper;

import com.jk.pojo.CourseComment;
import com.jk.pojo.CourseCommentVO;

import java.util.List;
import java.util.Map;

public interface CourseCommentMapper {
    public void insertComment(CourseComment courseComment);
    public List<CourseCommentVO> selectCourseCommentList();
    public List<CourseCommentVO> selectClassCommentList(String classId);
    public Integer selectGoodCommentNumber(String classId);
    public Integer selectCommentNumber(String classId);
    public String selectCommentDetail(Map map);
}

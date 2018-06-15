package com.jk.testMapper.Impl;

import com.jk.pojo.User;
import com.jk.testMapper.TestMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestMapperImpl extends SqlSessionDaoSupport implements TestMapper {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public User findUser(String phone) {
        return super.getSqlSession().selectOne("com.jk.testMapper.TestMapper"+".findUser",phone);
    }
}

package com.jk.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jk.mapper.FactoryMapper;
import com.jk.pagination.Page;
import com.jk.pojo.Factory;
import com.jk.pojo.Factory;
import com.jk.service.FactoryService;
@Service
@Qualifier("factoryservice")
public class FactoryServiceImpl implements FactoryService {
	
	@Autowired
	private FactoryMapper mapper;

	@Override
	public List<Factory> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Factory> find(Map paraMap) {
		// TODO Auto-generated method stub
		return mapper.find(paraMap);
	}

	@Override
	public Factory get(Serializable id) {
		// TODO Auto-generated method stub
		return  mapper.get(id);
	}

	@Override
	public void insert(Factory factory) {
		// TODO Auto-generated method stub
		factory.setId(UUID.randomUUID().toString());
		factory.setState("1");
		mapper.insert(factory);
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		mapper.deleteById(id);
		
	}

	@Override
	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		mapper.delete(ids);
		
	}

	@Override
	public void update(Factory factory) {
		// TODO Auto-generated method stub
		mapper.update(factory);
	}

	@Override
	public void start(Serializable[] ids) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("state",1);
		map.put("ids",ids);
		mapper.updateState(map);
	}

	@Override
	public void stop(Serializable[] ids) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("state",0);
		map.put("ids",ids);
		mapper.updateState(map);
	}


}

package com.jk.mapper;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.jk.domain.BaseDao;
import com.jk.pojo.Factory;
import com.jk.pojo.FactoryC;


public interface FactoryMapper extends BaseDao<Factory> {
//	@Select(" select * from factory_c")
	public List<Factory> find(Map paraMap);
	public void insert(Factory factory);
	public void update(Factory factory);
	public Factory get(Serializable id);
	public void deleteById(Serializable id);		//按id删除，删除一条；支持整数型和字符串类型ID
	public void delete(Serializable[] ids);	
	public void updateState(Map map);
	
}
 
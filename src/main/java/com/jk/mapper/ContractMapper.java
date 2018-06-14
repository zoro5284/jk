package com.jk.mapper;

import com.jk.domain.BaseDao;
import com.jk.pojo.Contract;
import com.jk.pojo.Contract;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface ContractMapper {
    public List<Contract> find(Map paraMap);
    public void insert(Contract contract);
    public void update(Contract contract);
    public Contract get(Serializable id);
    public void deleteById(Serializable id);		//按id删除，删除一条；支持整数型和字符串类型ID
    public void delete(Serializable[] ids);
    public void updateState(Map map);
}


package com.jk.service.impl;

import com.jk.mapper.ContractMapper;
import com.jk.pagination.Page;
import com.jk.pojo.Contract;
import com.jk.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ContractServiceImpl implements ContractService{
    @Autowired
    private ContractMapper mapper;

    @Override
    public List<Contract> findPage(Page page) {
        return null;
    }

    @Override
    public List<Contract> find(Map paraMap) {
        return mapper.find(paraMap);
    }

    @Override
    public Contract get(Serializable id) {
        return mapper.get(id);
    }

    @Override
    public void insert(Contract contract) {
        contract.setId(UUID.randomUUID().toString());
        contract.setState(0);
        mapper.insert(contract);
    }

    @Override
    public void update(Contract contract) {
        mapper.update(contract);
    }

    @Override
    public void deleteById(Serializable id) {
        mapper.deleteById(id);
    }

    @Override
    public void delete(Serializable[] ids) {
        mapper.delete(ids);
    }

    @Override
    public void submit(Serializable[] ids) {
        Map map = new HashMap();
        map.put("state",1);
        map.put("ids",ids);
        mapper.updateState(map);
    }

    @Override
    public void cancel(Serializable[] ids) {
        Map map = new HashMap();
        map.put("state",0);
        map.put("ids",ids);
        mapper.updateState(map);
    }
}

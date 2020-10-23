package com.jk.gy.service;

import com.jk.gy.dao.EmpMapper;
import com.jk.gy.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;


    @Override
    public List<Emp> empList() {
        return empMapper.empList();
    }

    @Override
    public void saveEmp(Emp emp) {
        if (emp.getEid()==null){
            empMapper.insertSelective(emp);
        }else {
            empMapper.updateByPrimaryKeySelective(emp);
        }
    }

    @Override
    public void delEmp(Integer eid) {
        empMapper.deleteByPrimaryKey(eid);
    }

    @Override
    public Emp selEmp(Integer eid) {
        return empMapper.selectByPrimaryKey(eid);
    }
}

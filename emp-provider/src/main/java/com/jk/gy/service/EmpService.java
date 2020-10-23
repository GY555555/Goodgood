package com.jk.gy.service;

import com.jk.gy.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> empList();

    void saveEmp(Emp emp);

    void delEmp(Integer eid);

    Emp selEmp(Integer eid);
}

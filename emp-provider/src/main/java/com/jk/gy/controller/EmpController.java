package com.jk.gy.controller;

import com.jk.gy.pojo.Emp;
import com.jk.gy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("empList")
    public List<Emp> empList (){
        List<Emp> list = empService.empList();
        return list;
    }

    @RequestMapping("saveEmp")
    public void saveEmp(@RequestBody Emp emp){
        empService.saveEmp(emp);
    }

    @RequestMapping("delEmp")
    public String delEmp(@RequestParam Integer eid){
        empService.delEmp(eid);
        return "success";
    }

    @RequestMapping("selEmp")
    public Emp selEmp(@RequestParam Integer eid){
        return empService.selEmp(eid);
    }

}

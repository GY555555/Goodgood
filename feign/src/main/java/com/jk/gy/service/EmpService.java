package com.jk.gy.service;

import com.jk.gy.pojo.Emp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "emp-proviter")
public interface EmpService {

    @RequestMapping("empList")
    public List<Emp> empList ();

    @RequestMapping("saveEmp")
    public void saveEmp(@RequestBody Emp emp);

    @RequestMapping("delEmp")
    public String delEmp(@RequestParam Integer eid);

    @RequestMapping("selEmp")
    public Emp selEmp(@RequestParam Integer eid);

}

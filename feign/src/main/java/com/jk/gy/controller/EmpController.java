package com.jk.gy.controller;

import com.jk.gy.pojo.Emp;
import com.jk.gy.pojo.Order;
import com.jk.gy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("empList")
    public String empList(Model model){
        List<Emp> list = empService.empList();
        model.addAttribute("emp",list);
        return "listemp";
    }

    @RequestMapping("toA")
    public String add(Model model){
        model.addAttribute("emp",new Emp());
        return "empadd";
    }

    @RequestMapping("delEmp")
    public String delEmp(Integer eid){
        empService.delEmp(eid);
        return "redirect:empList";
    }

    @RequestMapping("selEmp")
    public String selEmp(Integer eid,Model model){
        Emp emp = empService.selEmp(eid);
        model.addAttribute("emp",emp);
        return "empadd";
    }

    @RequestMapping("saveEmp")
    public String saveEmp(Emp emp){
        empService.saveEmp(emp);
        return "redirect:empList";
    }

}

package com.example.springbootthymeleafcrudwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.springbootthymeleafcrudwebapp.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //display list of employees
    @RequestMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listofEmployees",employeeService.getAllEmployees());
        return "index";
    }

}

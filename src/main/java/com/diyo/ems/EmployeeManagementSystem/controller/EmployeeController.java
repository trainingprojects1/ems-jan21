package com.diyo.ems.EmployeeManagementSystem.controller;

import com.diyo.ems.EmployeeManagementSystem.entity.Employee;
import com.diyo.ems.EmployeeManagementSystem.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRespository employeeRespository;

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return  employeeRespository.findAll();
    }

    @GetMapping("/getById")
    public String getEmployeeById(){
        return  "Hello world";
    }

    /**
     * This method is added by Samon
     * @return
     */
    @GetMapping("/getByIdUpdated")
    public String getEmployeeByIdUpdated(){
        return  "Hello world--UpdatedBySamon";
    }
}

package com.diyo.ems.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diyo.ems.EmployeeManagementSystem.entity.Employee;
import com.diyo.ems.EmployeeManagementSystem.repository.EmployeeRespository;

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

     * @return
     */
    @GetMapping("/getByIdUpdated")
    public String getEmployeeByIdUpdated(){
        return  "Hello world--UpdatedBySamon";
    }

    @GetMapping("/getIDByUpdatedUser")
    public String getIDByUpdatedUser() {
        return "New Dummy Method";
    }

    @PutMapping("/DeleteId")
    public String deleteEmployeeId(){
        return  "Hello world new changes";

    }
}

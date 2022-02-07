package com.diyo.ems.EmployeeManagementSystem.repository;

import com.diyo.ems.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {
}

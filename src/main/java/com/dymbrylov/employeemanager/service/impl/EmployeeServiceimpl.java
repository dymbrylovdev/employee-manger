package com.dymbrylov.employeemanager.service.impl;

import com.dymbrylov.employeemanager.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceimpl {

    Employee addEmployee(Employee employee);
    Employee findEmployee(Long id);
    List<Employee> findAllEmployees();
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);

}

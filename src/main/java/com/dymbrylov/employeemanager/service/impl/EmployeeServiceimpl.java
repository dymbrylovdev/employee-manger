package com.dymbrylov.employeemanager.service.impl;

import com.dymbrylov.employeemanager.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceimpl {

    List<Employee> findAllEmployees();
    Employee findEmployee(Long id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);

}

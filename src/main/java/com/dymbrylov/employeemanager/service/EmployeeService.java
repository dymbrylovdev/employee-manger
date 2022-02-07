package com.dymbrylov.employeemanager.service;

import com.dymbrylov.employeemanager.excaption.UserNotFoundException;
import com.dymbrylov.employeemanager.model.Employee;
import com.dymbrylov.employeemanager.repo.EmployeeRepo;
import com.dymbrylov.employeemanager.service.impl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// Создаем сервис для взаимодействия с б/д
@Service
public class EmployeeService implements EmployeeServiceimpl {


    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    @Override
    public Employee findEmployee(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by id: "+id+" was not found"));
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

}

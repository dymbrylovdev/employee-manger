package com.dymbrylov.employeemanager.repo;

import com.dymbrylov.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// Создаем DAO/Repositories
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
package com.tech.employeemanager.repository;

import com.tech.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Transactional
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}

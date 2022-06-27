package com.jouhar.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jouhar.webapp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
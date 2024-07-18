package com.anudip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}

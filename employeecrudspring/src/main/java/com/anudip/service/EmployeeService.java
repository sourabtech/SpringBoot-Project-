package com.anudip.service;

import com.anudip.entity.Employee;

public interface EmployeeService { 
	
  public	Employee addEmployee(Employee emp);// abstract method create
  public Employee getEmployee(int id);//get id for empolyee
  public  String deleteEmployee();
  public Employee updateEmployee(int id);
  
  
}

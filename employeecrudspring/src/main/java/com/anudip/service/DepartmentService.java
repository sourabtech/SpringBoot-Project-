package com.anudip.service;

import com.anudip.entity.Department;

public interface DepartmentService {
	
	public Department addDepartment(Department dept);
	public Department getDepartment( int dId);
	public Department deleteDepartment();
	public Department updateDepartment(int dId);



}

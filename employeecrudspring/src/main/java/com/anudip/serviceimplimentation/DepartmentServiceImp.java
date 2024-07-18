package com.anudip.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Department;
import com.anudip.repository.DepartmentRepository;
import com.anudip.service.DepartmentService;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired 
	DepartmentRepository deptRepository;
	
	
	@Override
	public Department addDepartment(Department dept) {
		deptRepository.save(dept);
		return dept;
		
	}

	@Override
	public Department getDepartment(int dId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department deleteDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(int dId) {
		// TODO Auto-generated method stub
		return null;
	}

}

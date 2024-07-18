package com.anudip.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Department;
import com.anudip.exception.DepartmentNotFoundException;
import com.anudip.ripository.DepartmentRepository;
import com.anudip.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository dserv;
	
	@Override
	public Department addDepartmentDetail(Department department) {
		// TODO Auto-generated method stub
		return dserv.save(department);	
	}

	@Override
	public Department getDepartmentDeatil(int did) {
		// TODO Auto-generated method stub
		return dserv.findById(did).orElseThrow(()->new DepartmentNotFoundException("Department Id not correct"));
	}

	@Override
	public Department updateDepartmentDetail(Department department, int did) {
		// TODO Auto-generated method stub
		 
        Department sdepartment = dserv.findById(did)
                .orElseThrow(() -> new DepartmentNotFoundException("Depaertment with ID " + did + " not found"));

        
        sdepartment.setDeptName(sdepartment.getDeptName());;
        sdepartment.setDid(sdepartment.getDid());
        sdepartment.setDeptHOD(sdepartment.getDeptHOD());
        sdepartment.setOnOfEmp(sdepartment.getOnOfEmp());    
        
        return dserv.save(sdepartment);
    }

	@Override
	public Department deleteDepartmentDetail(int did) {
		// TODO Auto-generated method stub
		 Department department = dserv.findById(did)
	                .orElseThrow(() -> new DepartmentNotFoundException("Department Id not found"));
	        dserv.delete(department);
			return department;
	}

}

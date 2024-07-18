package com.anudip.service;

import com.anudip.entity.Department;
public interface DepartmentService  {

	Department addDepartmentDetail (Department department);

	Department getDepartmentDeatil(int did);

	Department updateDepartmentDetail(Department department, int did);

	Department deleteDepartmentDetail(int did);
}

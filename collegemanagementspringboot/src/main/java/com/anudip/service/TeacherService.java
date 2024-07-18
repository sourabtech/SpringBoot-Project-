package com.anudip.service;

import com.anudip.entity.Teacher;


import org.springframework.stereotype.Service;


@Service
public interface TeacherService {

	Teacher addTeacherDetail (Teacher teacher);
	
	Teacher getTeacherDeatil(int tid);
	
	Teacher updateTeacherDetail(Teacher teacher, int tid);


	Teacher deleteTeacherDetail(int tid);

	
	
	
	
}
package com.anudip.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Teacher;
import com.anudip.exception.TeacherNotFoundException;
import com.anudip.ripository.TeacherRiposirory;
import com.anudip.service.TeacherService;


@Service
public class TeacherServiceImple implements TeacherService {
	
	@Autowired
	TeacherRiposirory techerRepo;
	
	@Override
	public Teacher addTeacherDetail(Teacher teacher) {
		// TODO Auto-generated method stub
		return techerRepo.save(teacher);
	}
	
    @Override
	public Teacher getTeacherDeatil(int tid) {
		// TODO Auto-generated method stub
		return techerRepo.findById(tid).
				orElseThrow(()-> new TeacherNotFoundException("Teacher Id not correct"));   
	}

    @Override
    public Teacher updateTeacherDetail(Teacher updatedTeacher, int tid) {
       
        Teacher existingTeacher = techerRepo.findById(tid)
                .orElseThrow(() -> new TeacherNotFoundException("Teacher with ID " + tid + " not found"));

       
        existingTeacher.setTname(updatedTeacher.getTname());
        existingTeacher.setTsurname(updatedTeacher.getTsurname());
        existingTeacher.setTphone(updatedTeacher.getTphone());
        existingTeacher.setDesignation(updatedTeacher.getDesignation());
        existingTeacher.setTemail(updatedTeacher.getTemail());

        
        return techerRepo.save(existingTeacher);
    }

	 @Override
	    public Teacher deleteTeacherDetail(int tid) {
	        Teacher teacher = techerRepo.findById(tid)
	                .orElseThrow(() -> new TeacherNotFoundException("Teacher Id not found"));
	        techerRepo.delete(teacher);
			return teacher;
	    }
	
	
}
	

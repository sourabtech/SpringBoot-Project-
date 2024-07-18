package com.anudip.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Student;
import com.anudip.exception.StudentNotFoundException;
import com.anudip.ripository.StudentRepository;
import com.anudip.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository srepo;

	@Override
	public Student addStudentDetail(Student student) {
		// TODO Auto-generated method stub
		return srepo.save(student);
	}
	@Override
	public Student getStudentDeatil(int sid) {
		// TODO Auto-generated method stub
		return srepo.findById(sid).orElseThrow(()->new StudentNotFoundException("Student Id not correct"));
	}

    @Override
    public Student updateStudentDetail(Student updatedStudent, int sid) {
       
        Student existingStudent = srepo.findById(sid)
                .orElseThrow(() -> new StudentNotFoundException("student with ID " + sid + " not found"));

       
        existingStudent.setSid(updatedStudent.getSid());
        existingStudent.setSaddr(updatedStudent.getSaddr());
        existingStudent.setSeduc(updatedStudent.getSeduc());
        existingStudent.setSemail(updatedStudent.getSemail());
        existingStudent.setSphone(updatedStudent.getSphone());

        
        return srepo.save(existingStudent);
    }

	 @Override
	    public Student deleteStudentDetail(int sid) {
	        Student student = srepo.findById(sid)
	                .orElseThrow(() -> new StudentNotFoundException("Student Id not found"));
	        srepo.delete(student);
			return student;
	    }
}
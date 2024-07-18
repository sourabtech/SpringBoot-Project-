package com.anudip.service;

import com.anudip.entity.Student;

public interface StudentService {

Student addStudentDetail (Student student);

Student getStudentDeatil(int sid);

Student updateStudentDetail(Student student, int sid);


Student deleteStudentDetail(int sid);
}
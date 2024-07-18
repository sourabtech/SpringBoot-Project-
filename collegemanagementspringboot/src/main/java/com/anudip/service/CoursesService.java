package com.anudip.service;

import com.anudip.entity.Courses;

public interface CoursesService {

	Courses addCoursesDetail (Courses courses);

	Courses getCoursesDeatil(int cid);

	Courses updateCoursesDetail(Courses courses, int cid);

	Courses deleteCoursesDetail(int cid);
}

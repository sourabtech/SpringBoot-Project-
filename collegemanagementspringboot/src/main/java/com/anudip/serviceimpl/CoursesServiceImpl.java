package com.anudip.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Courses;
import com.anudip.exception.CoursesNotFoundException;
import com.anudip.ripository.CoursesRepository;
import com.anudip.service.CoursesService;

@Service
public class CoursesServiceImpl implements CoursesService {

	@Autowired
	CoursesRepository crepo;
	
	@Override
	public Courses addCoursesDetail(Courses courses) {
		// TODO Auto-generated method stub
		return crepo.save(courses);
		
	}

	@Override
	public Courses getCoursesDeatil(int cid) {
		// TODO Auto-generated method stub
		return crepo.findById(cid).orElseThrow(()->new CoursesNotFoundException("courses Id not correct"));
	}

	@Override
	public Courses updateCoursesDetail(Courses courses, int cid) {
		// TODO Auto-generated method stub

        Courses coursee = crepo.findById(cid)
                .orElseThrow(() -> new CoursesNotFoundException("courses with ID " + cid + " not found"));
        
        coursee.setCourseName(coursee.getCourseName());
        coursee.setCourseFees(coursee.getCourseFees());
        coursee.setDuration(coursee.getDuration());
        coursee.setCid(coursee.getCid());
        return crepo.save(coursee);
	}

	@Override
	public Courses deleteCoursesDetail(int cid) {
		// TODO Auto-generated method stub
		 Courses courses = crepo.findById(cid)
	                .orElseThrow(() -> new CoursesNotFoundException("courses Id not found"));
	        crepo.delete(courses);
			return courses;	}

	
}

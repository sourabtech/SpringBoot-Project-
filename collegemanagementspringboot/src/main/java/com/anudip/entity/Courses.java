package com.anudip.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Courses {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int cid;
		
		@Column(length=20, nullable = true)
		@NotBlank(message = "Course Name cannot be blank")
		private String courseName;
		
		@Column(length=8, nullable = true)
		@NotBlank(message = "Duration cannot be blank")
		private String duration;
				
		@Column(length=10, nullable = true)
		@NotNull(message = "Fees cannot be blank")
		private double courseFees;

		//one couses has one student
		@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JsonBackReference
		private Student student;
		
		
		
		
		public Courses(int cid, @NotBlank(message = "Course Name cannot be blank") String courseName,
				@NotBlank(message = "Duration cannot be blank") String duration,
				@NotNull(message = "Fees cannot be blank") double courseFees) {
			super();
			this.cid = cid;
			this.courseName = courseName;
			this.duration = duration;
			this.courseFees = courseFees;
		}

		public Courses() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public double getCourseFees() {
			return courseFees;
		}

		public void setCourseFees(double courseFees) {
			this.courseFees = courseFees;
		}

		@Override
		public String toString() {
			return "Courses [cid=" + cid + ", courseName=" + courseName + ", duration=" + duration + ", courseFees="
					+ courseFees + "]";
		}
		
		
}

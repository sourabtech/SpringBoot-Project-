package com.anudip.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Batches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	
	@Column(length=20, nullable = true)
	//@NotBlank(message = "Course Name cannot be blank")
	private String bname;
	
	@Column(length=20, nullable = true)
	//@NotBlank(message = "Course subject cannot be blank")
	private String subject;
	
	@Column(length=20, nullable = true)
	//@NotBlank(message = "Course startdate cannot be blank")
	private String startdate;
	
	@Column(length=20, nullable = true)
	//@NotBlank(message = "Course enddate cannot be blank")
	private String enddate;
	
	@Column(length=20, nullable = true)
	//@NotBlank(message = "Course duration cannot be blank")
	private String duration;

	
	//many batches has one teacher
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="TeacherId", referencedColumnName = "tid")
	@JsonBackReference
	private Teacher teacher;
	
	
	public Batches(int bid, @NotBlank(message = "Course Name cannot be blank") String bname,
			@NotBlank(message = "Course subject cannot be blank") String subject,
			@NotBlank(message = "Course startdate cannot be blank") String startdate,
			@NotBlank(message = "Course enddate cannot be blank") String enddate,
			@NotBlank(message = "Course duration cannot be blank") String duration) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.subject = subject;
		this.startdate = startdate;
		this.enddate = enddate;
		this.duration = duration;
	}

	public Batches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Batches [bid=" + bid + ", bname=" + bname + ", subject=" + subject + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", duration=" + duration + "]";
	}
	

		
}

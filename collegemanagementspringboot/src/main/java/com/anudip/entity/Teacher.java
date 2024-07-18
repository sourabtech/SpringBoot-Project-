package com.anudip.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Teacher name can not be blank")
	private String tname;
	
	@Column(length=25 , nullable = false)
	@NotBlank(message = "Teacher surname can not be blank")
	private String tsurname;
	
	@Column(length=25, nullable = false, unique = true)
	@NotBlank(message = "Teacher Email ID can not be blank")
    @Email(message = "Email id is not proper")
	private String temail;
	
	@Column(length=11, nullable = false, unique = true)
	@NotBlank(message = "phone number cannot be null")
	private String tphone;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Teacher designation can not be blank")
	private String designation;

	

	// Constructors, getters, setters, and toString method
	public Teacher() {}

	public Teacher(int tid, @NotBlank(message = "Teacher name can not be blank") String tname,
			@NotBlank(message = "Teacher surname can not be blank") String tsurname,
			@NotBlank(message = "Teacher Email ID can not be blank")
			@Email(message = "Email id is not proper") String temail,
			@NotBlank(message = "phone number cannot be null") String tphone,
			@NotBlank(message = "Teacher designation can not be blank") String designation) {
		this.tid = tid;
		this.tname = tname;
		this.tsurname = tsurname;
		this.temail = temail;
		this.tphone = tphone;
		this.designation = designation;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsurname() {
		return tsurname;
	}

	public void setTsurname(String tsurname) {
		this.tsurname = tsurname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public String getTphone() {
		return tphone;
	}

	public void setTphone(String tphone) {
		this.tphone = tphone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// Getters and Setters...

	
	
}

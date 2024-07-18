package com.anudip.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int did;
	
	@Column(length=20, nullable = false)
	@NotBlank(message = "Department Name cannot be blank")
	private String deptName;
	
	@Column(length=20, nullable = false)
	@NotBlank(message = "Department Name cannot be blank")
	private String deptHOD;
	
	@Column(length=40, nullable = false)
	@NotNull(message = "kindly mention no of employess")
	private int onOfEmp;
	
	
	
	
	// Constructors, getters, setters, and toString method
	public Department() {}

	public Department(int did, @NotBlank(message = "Department Name cannot be blank") String deptName,
			@NotBlank(message = "Department Name cannot be blank") String deptHOD,
			@NotNull(message = "kindly mention no of employess") int onOfEmp) {
		this.did = did;
		this.deptName = deptName;
		this.deptHOD = deptHOD;
		this.onOfEmp = onOfEmp;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptHOD() {
		return deptHOD;
	}

	public void setDeptHOD(String deptHOD) {
		this.deptHOD = deptHOD;
	}

	public int getOnOfEmp() {
		return onOfEmp;
	}

	public void setOnOfEmp(int onOfEmp) {
		this.onOfEmp = onOfEmp;
	}

	// Getters and Setters...

}

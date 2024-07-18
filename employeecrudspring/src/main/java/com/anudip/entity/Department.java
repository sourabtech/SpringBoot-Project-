package com.anudip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int dId;
	@Column(length = 30)
	private String deptName;
	@Column(length = 30)
	private String deptadd;
	@Column(length = 30)
	private int deptno;

	public Department(int dId, String deptName, String deptadd, int deptno) {
		super();
		this.dId = dId;
		this.deptName = deptName;
		this.deptadd = deptadd;
		this.deptno = deptno;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptadd() {
		return deptadd;
	}

	public void setDeptadd(String deptadd) {
		this.deptadd = deptadd;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", deptName=" + deptName + ", deptadd=" + deptadd + ", deptno=" + deptno
				+ "]";
	}

	
}

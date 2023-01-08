package com.restAPI.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="studentID")
	private int studentId;
	
	@Column(name="familyID")
	private int familyId;
	
	@Column(name="studentName")
	private int studentName;
	
	@Column(name="address")
	private int studentAddress;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public int getStudentName() {
		return studentName;
	}

	public void setStudentName(int studentName) {
		this.studentName = studentName;
	}

	public int getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(int studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", familyId=" + familyId + ", studentName=" + studentName
				+ ", studentAddress=" + studentAddress + "]";
	}
	
	
	
	
	

}

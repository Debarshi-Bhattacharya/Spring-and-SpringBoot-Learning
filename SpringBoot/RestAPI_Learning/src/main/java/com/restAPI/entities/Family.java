package com.restAPI.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Family")
public class Family {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="familyID")
	private int familyId;
	
	@Column(name="phoneNumber")
	private int phoneNumber;

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Family [familyId=" + familyId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}

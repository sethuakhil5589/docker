package com.akhil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sId;
	private String sName;
	private Integer sAge;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getsAge() {
		return sAge;
	}
	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}
	public StudentData(Integer sId, String sName, Integer sAge) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
	}
	public StudentData() {
		super();
	}
	@Override
	public String toString() {
		return "StudentData [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
}

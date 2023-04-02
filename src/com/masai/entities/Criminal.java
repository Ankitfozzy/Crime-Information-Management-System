package com.masai.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Criminal implements Serializable{

//
	
	private Integer criminalId;
	private String name;
	private LocalDate dob;
	private String gender;
	private String identifyingMark;
	private LocalDate firstArrestLocalDate;
	private String arrestedFromPS;
	private List<Crime> crimesList;
	
	


	@Override
	public String toString() {
		return "Criminal [criminalId=" + criminalId + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", identifyingMark=" + identifyingMark + ", firstArrestLocalDate=" + firstArrestLocalDate
				+ ", arrestedFromPS=" + arrestedFromPS + ", crimesList=" + crimesList + "]";
	}


	public Criminal(Integer criminalId, String name, LocalDate dob, String gender, String identifyingMark, LocalDate firstArrestLocalDate,
					String arrestedFromPS) {
		super();
		this.criminalId = criminalId;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.identifyingMark = identifyingMark;
		this.firstArrestLocalDate = firstArrestLocalDate;
		this.arrestedFromPS = arrestedFromPS;
	}
	
	
	public Criminal() {
		super();
	}
	


	public Integer getCriminalId() {
		return criminalId;
	}
	public void setCriminalId(Integer criminalId) {
		this.criminalId = criminalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdentifyingMark() {
		return identifyingMark;
	}
	public void setIdentifyingMark(String identifyingMark) {
		this.identifyingMark = identifyingMark;
	}
	public LocalDate getFirstArrestLocalDate() {
		return firstArrestLocalDate;
	}
	public void setFirstArrestLocalDate(LocalDate firstArrestLocalDate) {
		this.firstArrestLocalDate = firstArrestLocalDate;
	}
	public String getArrestedFromPS() {
		return arrestedFromPS;
	}
	public void setArrestedFromPS(String arrestedFromPS) {
		this.arrestedFromPS = arrestedFromPS;
	}
	
	

}

package com.masai.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class Crime implements Serializable{
	
	// 
	
	private Integer crimeId;
	private String type;
	private String description;
	private String pSArea;
	private LocalDate date;
	private String victimName;
	private List<Criminal> criminalsList;
	


	public Crime(Integer crimeId, String type, String description, String pSArea, LocalDate date, String victimName) {
		super();
		this.crimeId = crimeId;
		this.type = type;
		this.description = description;
		this.pSArea = pSArea;
		this.date = date;
		this.victimName = victimName;
	}
	
	
	@Override
	public String toString() {
		return "Crime [crimeId=" + crimeId + ", type=" + type + ", description=" + description + ", pSArea=" + pSArea
				+ ", date=" + date + ", victimName=" + victimName + ", criminalsList=" + criminalsList + "]";
	}


	public Crime() {
		super();
	}


	public Integer getCrimeId() {
		return crimeId;
	}
	public void setCrimeId(Integer crimeId) {
		this.crimeId = crimeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getpSArea() {
		return pSArea;
	}
	public void setpSArea(String pSArea) {
		this.pSArea = pSArea;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getVictimName() {
		return victimName;
	}

	public List<Criminal> getCriminalsList() {
		return criminalsList;
	}

	public void setCriminalsList(List<Criminal> criminalsList) {
		this.criminalsList = criminalsList;
	}

	public void setVictimName(String victimName) {
		this.victimName = victimName;
	}

}

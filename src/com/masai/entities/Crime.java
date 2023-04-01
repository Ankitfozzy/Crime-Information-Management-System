package com.masai.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class Crime implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private long crimeId;
	private String type;
	private String description;
	private String pSArea;
	private LocalDate date;
	private String victimName;
	private List<Criminal> criminalList;
	
	public Crime(long crimeId, String type, String description, String pSArea, LocalDate date, String victimName) {
		super();
		this.crimeId = crimeId;
		this.type = type;
		this.description = description;
		this.pSArea = pSArea;
		this.date = date;
		this.victimName = victimName;
	}
	
	
	public Crime() {
		super();
	}


	public long getCrimeId() {
		return crimeId;
	}
	public void setCrimeId(long crimeId) {
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
	public void setVictimName(String victimName) {
		this.victimName = victimName;
	}


	public List<Criminal> getCriminalList() {
		return criminalList;
	}


	public void setCriminalList(List<Criminal> criminalList) {
		this.criminalList = criminalList;
	}
		
}

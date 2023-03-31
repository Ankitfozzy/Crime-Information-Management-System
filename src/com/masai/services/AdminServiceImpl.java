package com.masai.services;

import java.util.Map;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;

public class AdminServiceImpl implements AdminService{

	@Override
	public String addCrime(Crime crime, Map<Integer, Crime> Crimes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Crime updateCrime(Crime crime, Map<Integer, Crime> Crimes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addCriminal(Criminal criminal, Map<Integer, Criminal> Criminals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criminal updateCriminal(Criminal criminal, Map<Integer, Criminal> Criminals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String assignCriminalsToCrime(Integer crimeId, Map<Integer, Crime> Crimes, Criminal criminalUpdated,
			Map<Integer, Criminal> Criminals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeCriminalFromCrime(Crime crime, Map<Integer, Crime> Crimes, Criminal criminal,
			Map<Integer, Criminal> Criminals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCrimeByCrimeId(Crime crimeId, Map<Integer, Crime> Crimes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCriminalByCriminalId(Criminal criminalId, Map<Integer, Criminal> Criminals) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	

}

package com.masai.services;


import java.util.Map;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;

public interface AdminService {
	
	String addCrime(Crime crime, Map<Integer,Crime> Crimes);
	Crime updateCrime(Crime crime, Map<Integer,Crime> Crimes);
	String addCriminal(Criminal criminal, Map<Integer, Criminal> Criminals);
	Criminal updateCriminal(Criminal criminal, Map<Integer, Criminal> Criminals);
	String assignCriminalsToCrime(Integer crimeId, Map<Integer,Crime> Crimes, Criminal criminalUpdated, Map<Integer, Criminal> Criminals);
	Boolean removeCriminalFromCrime(Crime crime, Map<Integer,Crime> Crimes,Criminal criminal, Map<Integer, Criminal> Criminals);
	Boolean deleteCrimeByCrimeId(Crime crimeId, Map<Integer,Crime> Crimes);
	Boolean deleteCriminalByCriminalId(Criminal criminalId, Map<Integer, Criminal> Criminals);
	
}

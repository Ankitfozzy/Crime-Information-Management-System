package com.masai.services;


import java.util.List;
import java.util.Map;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;

public interface AdminService {
	
	String addCrime(Crime crime, Map<Integer,Crime> Crimes);
	Crime updateCrime(Crime crime, Map<Integer,Crime> Crimes) throws Exception;
	String addCriminal(Criminal criminal, Map<Integer, Criminal> Criminals);
	Criminal updateCriminal(Criminal criminal, Map<Integer, Criminal> Criminals) throws Exception;
	String assignCriminalsToCrime(Integer crimeId, Map<Integer,Crime> Crimes, List<Integer> criminalList, Map<Integer, Criminal> Criminals);
	Boolean removeCriminalFromCrime(Integer crimeId, Map<Integer,Crime> Crimes,Integer criminalId, Map<Integer, Criminal> Criminals) throws Exception;
	Boolean deleteCrimeByCrimeId(Integer crimeId, Map<Integer,Crime> Crimes) throws Exception;
	Boolean deleteCriminalByCriminalId(Integer criminalId, Map<Integer, Criminal> Criminals) throws Exception;
	
}
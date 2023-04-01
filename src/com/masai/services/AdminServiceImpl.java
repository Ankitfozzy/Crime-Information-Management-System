package com.masai.services;

import java.util.List;
import java.util.Map;
import com.masai.entities.Crime;
import com.masai.entities.Criminal;

public class AdminServiceImpl implements AdminService{

	@Override
	public String addCrime(Crime crime, Map<Integer, Crime> Crimes) {
		Crimes.put(crime.getCrimeId(),crime);
		return "Crime added Successfully";
	}

	@Override
	public Crime updateCrime(Crime crime, Map<Integer, Crime> Crimes) throws Exception {

		if(Crimes.containsKey(crime.getCrimeId())){
			return Crimes.put(crime.getCrimeId(),crime);
		}
		throw new Exception("not here");
	}

	@Override
	public String addCriminal(Criminal criminal, Map<Integer, Criminal> Criminals) {
		Criminals.put(criminal.getCriminalId(),criminal);
		return "Criminal added Successfully";
	}

	@Override
	public Criminal updateCriminal(Criminal criminal, Map<Integer, Criminal> Criminals) throws Exception {
		if(Criminals.containsKey(criminal.getCriminalId())){
			return Criminals.put(criminal.getCriminalId(),criminal);
		}
		throw new Exception("not here");
	}

	@Override
	public String assignCriminalsToCrime(Integer crimeId, Map<Integer, Crime> Crimes, List<Integer> criminalIdList, Map<Integer, Criminal> Criminals) {
		Crime crime = Crimes.get(crimeId);
		List<Criminal> criminalList = null;
		criminalIdList.stream().forEach( criminalId ->{
			Criminal criminal = Criminals.get(criminalId);
			criminalList.add(criminal);
		});
		crime.setCriminalList(criminalList);
		return "Criminals added to crime";
	}

	@Override
	public Boolean removeCriminalFromCrime(Integer crimeId, Map<Integer, Crime> Crimes, Integer criminalId, Map<Integer, Criminal> Criminals) throws Exception {
		Criminal criminal = Criminals.get(criminalId);
		Crime crime = Crimes.get(crimeId);

		if(Criminals.containsKey(criminalId)){
			if(Crimes.containsKey(crimeId)){
				List<Criminal> criminalList = crime.getCriminalList();
				criminalList.remove(criminal);
				crime.setCriminalList(criminalList);
				return true;
			}
			throw new Exception("crime not found");
		}
		throw new Exception("criminal not found");
	}


	@Override
	public Boolean deleteCrimeByCrimeId(Integer crimeId, Map<Integer, Crime> Crimes) throws Exception {

		if(Crimes.containsKey(crimeId)){
			Crimes.remove(crimeId);
			return true;
		}
		throw new Exception("crime not found");
	}

	@Override
	public Boolean deleteCriminalByCriminalId(Integer criminalId, Map<Integer, Criminal> Criminals) throws Exception {
		if(Criminals.containsKey(criminalId)){
			Criminals.remove(criminalId);
			return true;
		}
		throw new Exception("criminal not found");
	}
}
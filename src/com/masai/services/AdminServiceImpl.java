package com.masai.services;

import java.util.List;
import java.util.Map;
import com.masai.entities.Crime;
import com.masai.entities.Criminal;
import com.masai.exceptions.CrimeNotFound;
import com.masai.exceptions.CriminalNotFound;

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
		throw new CrimeNotFound("Crime not found");
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
		throw new CriminalNotFound("criminal not found");
	}

	@Override
	public String assignCriminalsToCrime(Integer crimeId, Map<Integer, Crime> Crimes, List<Integer> criminalIdList, Map<Integer, Criminal> Criminals) {
		Crime crime = Crimes.get(crimeId);
		List<Criminal> criminalList = null;
		criminalIdList.stream().forEach( criminalId ->{
			Criminal criminal = Criminals.get(criminalId);
			criminalList.add(criminal);
		});
		crime.setCriminalsList(criminalList);
		return "Criminals added to crime";
	}

	@Override
	public Boolean removeCriminalFromCrime(Integer crimeId, Map<Integer, Crime> Crimes, Integer criminalId, Map<Integer, Criminal> Criminals) throws Exception {
		Criminal criminal = Criminals.get(criminalId);
		Crime crime = Crimes.get(crimeId);

		if(Criminals.containsKey(criminalId)){
			if(Crimes.containsKey(crimeId)){
				List<Criminal> criminalList = crime.getCriminalsList();
				criminalList.remove(criminal);
				crime.setCriminalsList(criminalList);
				return true;
			}
			throw new CrimeNotFound("crime not found");
		}
		throw new CriminalNotFound("criminal not found");
	}


	@Override
	public Boolean deleteCrimeByCrimeId(Integer crimeId, Map<Integer, Crime> Crimes) throws Exception {

		if(Crimes.containsKey(crimeId)){
			Crimes.remove(crimeId);
			return true;
		}
		throw new CrimeNotFound("crime not found");
	}

	@Override
	public Boolean deleteCriminalByCriminalId(Integer criminalId, Map<Integer, Criminal> Criminals) throws Exception {
		if(Criminals.containsKey(criminalId)){
			Criminals.remove(criminalId);
			return true;
		}
		throw new CriminalNotFound("criminal not found");
	}
}

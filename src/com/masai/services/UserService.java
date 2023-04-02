package com.masai.services;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface UserService {

    Integer totalNumberOfCrimeByPSAreaWithDateRange(String pSArea,Map<Integer, Crime> Crimes);
    Integer totalNumberOfCrimeByCrimeTypeWithDateRange(String crimeType,Map<Integer, Crime> Crimes);
    Criminal searchCriminalByName(String criminalName, Map<Integer, Criminal> Criminals);
    Crime searchCrimeByDescription(String description, Map<Integer, Crime> Crimes);
    List<Criminal> viewAllCriminals(Map<Integer, Criminal> Criminals);

}

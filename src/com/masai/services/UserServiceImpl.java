package com.masai.services;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{


    @Override
    public Integer totalNumberOfCrimeByPSAreaWithDateRange(String pSArea, LocalDate from, LocalDate to, Map<Integer, Crime> Crimes) {
        return null;
    }

    @Override
    public Integer totalNumberOfCrimeByCrimeTypeWithDateRange(String crimeType, LocalDate from, LocalDate to, Map<Integer, Crime> Crimes) {
        return null;
    }

    @Override
    public Criminal searchCriminalByName(String criminalName, Map<Integer, Criminal> Criminals) {

        for (Map.Entry<Integer,Criminal> entry : Criminals.entrySet()){
            if(entry.getValue().getName().equals(criminalName)){
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Crime searchCrimeByDescription(String description, Map<Integer, Crime> Crimes) {
        for (Map.Entry<Integer,Crime> entry : Crimes.entrySet()){
            if(entry.getValue().getDescription().equals(description)){
                return entry.getValue();
            }
        }
        return null;
    }
    @Override
    public List<Criminal> viewAllCriminals(Map<Integer, Criminal> Criminals) {

        for (Map.Entry<Integer,Criminal> entry : Criminals.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue().toString());

        return null;
    }
}

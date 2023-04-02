package com.masai.services;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;
import com.masai.exceptions.CrimeNotFound;
import com.masai.exceptions.CriminalNotFound;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{


    @Override
    public Integer totalNumberOfCrimeByPSAreaWithDateRange(String pSArea, Map<Integer, Crime> Crimes) {

        List<Crime> crimeList = null;
        for (Map.Entry<Integer,Crime> entry : Crimes.entrySet()){
            if(entry.getValue().getpSArea().equals(pSArea)){
                crimeList.add(entry.getValue());
            }
        }
        return crimeList.size();
    }

    @Override
    public Integer totalNumberOfCrimeByCrimeTypeWithDateRange(String crimeType,  Map<Integer, Crime> Crimes) {
        List<Crime> crimeList = null;
        for (Map.Entry<Integer,Crime> entry : Crimes.entrySet()){
            if(entry.getValue().getType().equals(crimeType)){
                crimeList.add(entry.getValue());
            }
        }
        return crimeList.size();
    }

    @Override
    public Criminal searchCriminalByName(String criminalName, Map<Integer, Criminal> Criminals) {

        for (Map.Entry<Integer,Criminal> entry : Criminals.entrySet()){
            if(entry.getValue().getName().equals(criminalName)){
                return entry.getValue();
            }
        }
        throw new CriminalNotFound("Criminal not found");
    }

    @Override
    public Crime searchCrimeByDescription(String description, Map<Integer, Crime> Crimes) {
        for (Map.Entry<Integer,Crime> entry : Crimes.entrySet()){
            if(entry.getValue().getDescription().equals(description)){
                return entry.getValue();
            }
        }
        throw new CrimeNotFound("Crime not found");
    }
    @Override
    public List<Criminal> viewAllCriminals(Map<Integer, Criminal> Criminals) {

        for (Map.Entry<Integer,Criminal> entry : Criminals.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue().toString());

        throw new CriminalNotFound("Criminal not found");
    }
}

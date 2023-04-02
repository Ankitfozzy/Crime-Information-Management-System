package com.masai;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.masai.entities.Crime;
import com.masai.entities.Criminal;
import com.masai.exceptions.InvalidCredentials;
import com.masai.utility.Files;
import com.masai.services.*;

public class Main {
	
	//
	
	private static void AdminFunctionality(Scanner sc, Map<Integer, Crime> Crimes, Map<Integer, Criminal> Criminals) throws FileNotFoundException {

		adminLogin(sc);
		
		AdminService adminService = new AdminServiceImpl();
		
		
		int choice = 0;
		try {
			do {
				System.out.println("Press 1 add the Crime");
				System.out.println("Press 2 update the Crime");
				System.out.println("Press 3 add the criminal");
				System.out.println("Press 4 update the criminal");
				System.out.println("Press 5 assign criminals to crime");
				System.out.println("Press 6 remove criminal from crime");
				System.out.println("Press 7 delete crime using crime id");
				System.out.println("Press 8 delete criminal using criminal id");
				choice = sc.nextInt();

				switch (choice) {
				
				case 1:
					
					System.out.println("Enter Crime Id: ");
					int crimeId = sc.nextInt();
					System.out.println("Enter the type of Crime: ");
					String type = sc.next();
					System.out.println("Enter the description: ");
					String description = sc.next();
					System.out.println("Enter the pSArea: ");
					String pSArea = sc.next();
					System.out.println("Enter the year of Crime: ");
					int y = sc.nextInt();
					System.out.println("Enter the month of Crime: ");
					int m = sc.nextInt();
					System.out.println("Enter the day of Crime: ");
					int d = sc.nextInt();
					LocalDate date = LocalDate.of(y,m,d);
					System.out.println("Enter the victim name: ");
					String victimName = sc.next();
					Crime crime = new Crime(crimeId,type,description,pSArea,date,victimName);
					String added = adminService.addCrime(crime,Crimes);
					System.out.println(added);
					break;
					
				case 2:

					System.out.println("Enter Crime Id: ");
					int crimeIdUpdated = sc.nextInt();
					System.out.println("Enter the type of Crime: ");
					String typeUpdated = sc.next();
					System.out.println("Enter the description: ");
					String descriptionUpdated = sc.next();
					System.out.println("Enter the pSArea: ");
					String pSAreaUpdated = sc.next();
					System.out.println("Enter the year of Crime: ");
					int yUpdated = sc.nextInt();
					System.out.println("Enter the month of Crime: ");
					int mUpdated = sc.nextInt();
					System.out.println("Enter the day of Crime: ");
					int dUpdated = sc.nextInt();
					LocalDate dateUpdated = LocalDate.of(yUpdated,mUpdated,dUpdated);
					System.out.println("Enter the victim name: ");
					String victimNameUpdated = sc.next();
					Crime crimeUpdated = new Crime(crimeIdUpdated,typeUpdated,descriptionUpdated,pSAreaUpdated,dateUpdated,victimNameUpdated);
					Crime addedUpdated = adminService.updateCrime(crimeUpdated,Crimes);
					System.out.println(addedUpdated);
					break;
					
				case 3:

					System.out.println("Enter the criminalId: ");
					int criminalId = sc.nextInt();
					System.out.println("Enter the criminal Name: ");
					String name = sc.next();
					System.out.println("Enter the dob of the criminal: ");
					System.out.println("Enter the year of Criminal's dob: ");
					int yr = sc.nextInt();
					System.out.println("Enter the month of Criminal's dob: ");
					int mt = sc.nextInt();
					System.out.println("Enter the day of Criminal's dob: ");
					int dy = sc.nextInt();
					LocalDate dob = LocalDate.of(yr,mt,dy);
					System.out.println("Enter the gender of the criminal: ");
					String gender = sc.next();
					System.out.println("Enter the identifying mark of the criminal: ");
					String identifyingMark = sc.next();
					System.out.println("Enter the first Arrest Date: ");
					System.out.println("Enter the year of Criminal Arrest: ");
					int year = sc.nextInt();
					System.out.println("Enter the month of Criminal Arrest: ");
					int month = sc.nextInt();
					System.out.println("Enter the day of Criminal Arrest: ");
					int day = sc.nextInt();
					LocalDate firstArrestLocalDate = LocalDate.of(year,month,day);
					System.out.println("Enter the criminal arrested from which PS: ");
					String arrestedFromPS = sc.next();
					Criminal criminal = new Criminal(criminalId,name,dob,gender,identifyingMark,firstArrestLocalDate,arrestedFromPS);
					String add = adminService.addCriminal(criminal,Criminals);
					System.out.println(add);
					break;
					
				case 4:
					System.out.println("Enter the criminalId: ");
					int criminalIdUpdated = sc.nextInt();
					System.out.println("Enter the criminal Name: ");
					String nameUpdated = sc.next();
					System.out.println("Enter the dob of the criminal: ");
					System.out.println("Enter the year of Criminal: ");
					int yrUpdated = sc.nextInt();
					System.out.println("Enter the month of Criminal: ");
					int mtUpdated = sc.nextInt();
					System.out.println("Enter the day of Criminal: ");
					int dyUpdated = sc.nextInt();
					LocalDate dobUpdated = LocalDate.of(yrUpdated,mtUpdated,dyUpdated);
					System.out.println("Enter the gender of the criminal: ");
					String genderUpdated = sc.next();
					System.out.println("Enter the identifying mark of the criminal: ");
					String identifyingMarkUpdated = sc.next();
					System.out.println("Enter the first Arrest Date: ");
					System.out.println("Enter the year of Criminal Arrest: ");
					int yearUpdated = sc.nextInt();
					System.out.println("Enter the month of Criminal Arrest: ");
					int monthUpdated = sc.nextInt();
					System.out.println("Enter the day of Criminal Arrest: ");
					int dayUpdated = sc.nextInt();
					LocalDate firstArrestLocalDateUpdated = LocalDate.of(yearUpdated,monthUpdated,dayUpdated);
					System.out.println("Enter the criminal arrested from which PS: ");
					String arrestedFromPSUpdated = sc.next();
					Criminal criminalUpdated = new Criminal(criminalIdUpdated,nameUpdated,dobUpdated,genderUpdated,identifyingMarkUpdated,firstArrestLocalDateUpdated,arrestedFromPSUpdated);
					Criminal addUpdated = adminService.updateCriminal(criminalUpdated,Criminals);
					System.out.println(addUpdated);
					break;
					
				case 5:
			
					System.out.println("Enter the number of Criminals: ");
					int criminalNumber = sc.nextInt();
					System.out.println("Enter the crime Id: ");
					int crmId = sc.nextInt(); 
					List<Integer> criminalList = new LinkedList<>();
					for(int i=0;i<criminalNumber;i++) {
						System.out.println("Enter the criminal Id: ");
						int cRId = sc.nextInt();
						criminalList.add(cRId);
					}
					adminService.assignCriminalsToCrime(crmId, Crimes, criminalList, Criminals);
					break;
				case 6:

					System.out.println("Enter the Id of Criminals: ");
					int criminalIdForRemoval = sc.nextInt();
					System.out.println("Enter the crime Id: ");
					int crmIdForRemoval = sc.nextInt();

					adminService.removeCriminalFromCrime(crmIdForRemoval, Crimes, criminalIdForRemoval, Criminals);
					break;
				case 7:
					System.out.println("Enter the crime Id: ");
					int crmIdForRemove = sc.nextInt();

					 if(adminService.deleteCrimeByCrimeId(crmIdForRemove, Crimes)){
						 System.out.println("crime deleted with id: "+crmIdForRemove);
					 }

					break;
					
				case 8:
					System.out.println("Enter the Id of Criminals: ");
					int criminalIdForRemove = sc.nextInt();
					if(adminService.deleteCriminalByCriminalId(criminalIdForRemove, Criminals)){
						System.out.println("crime deleted with id: "+criminalIdForRemove);
					}

					break;
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}

			} while (choice <= 6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static void UserFunctionality(Scanner sc, Map<Integer, Crime> Crimes, Map<Integer, Criminal> Criminals) throws FileNotFoundException {


		UserService userService = new UserServiceImpl();

		int choice = 0;
		try {
			do {
				System.out.println("Press 1 to view total crime for each police station area for a date range.");
				System.out.println("Press 2 to view total crime for each crime type for a date range.");
				System.out.println("Press 3 to Can search for criminal by name.");
				System.out.println("Press 4 to Can search for crime by description.");
				choice = sc.nextInt();

				switch (choice) {

					case 1:

						System.out.println("Enter the pSArea: ");
						String pSArea = sc.next();

						userService.totalNumberOfCrimeByPSAreaWithDateRange(pSArea, Crimes);
						break;

					case 2:

						System.out.println("Enter the Crime type: ");
						String crimeType = sc.next();

						userService.totalNumberOfCrimeByCrimeTypeWithDateRange(crimeType, Crimes);
						break;

					case 3:
						System.out.println("Enter the criminal Name: ");
						String nameUpdated = sc.next();
						Criminal criminal =userService.searchCriminalByName(nameUpdated,Criminals);
                        System.out.println(criminal.toString());
						break;

					case 4:
						System.out.println("Enter the crime description: ");
						String crimeDescription = sc.next();
						Crime crime = userService.searchCrimeByDescription(crimeDescription, Crimes);
                        System.out.println(crime.toString());
						break;

					default:
						throw new IllegalArgumentException("Unexpected value: " + choice);
				}

			} while (choice <= 6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public static void adminLogin(Scanner sc) {

		System.out.println("Enter the user name");
		String userName = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		if (userName.equals("admin") && password.equals("admin")) {

			System.out.println("successfully login");
		} 
        else {
			throw new InvalidCredentials("Invalid Admin Credentials");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Crime> crimes = Files.crimeFile();
		Map<Integer, Criminal> criminals = Files.CriminalFile();

		System.out.println("Welcome , in Crime information Management System");

		try {

			int preference = 0;
			do {
				System.out.println("Please enter your preference, " + " '1' --> Admin login , '2' --> User login , '0' for exit");
				preference = sc.nextInt();
				switch (preference) {
				case 1:
					AdminFunctionality(sc,crimes,criminals);
					break;
				case 2:
					UserFunctionality(sc,crimes,criminals);
					break;
				case 0:
					System.out.println("successfully existed from the system");
					break;

				default:
					throw new IllegalArgumentException("Invalid Selection");
				}

			}

			while (preference != 0);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			// serialization (finally always executed)
			try (ObjectOutputStream poos = new ObjectOutputStream(new FileOutputStream("Crime.ser"))) {
				poos.writeObject(crimes);
				try (ObjectOutputStream coos = new ObjectOutputStream(new FileOutputStream("Criminal.ser"))) {
					coos.writeObject(criminals);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}

}


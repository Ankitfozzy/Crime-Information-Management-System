package com.masai.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;


public class Files {
	
	@SuppressWarnings("unchecked")
	public static Map<Integer, Crime> crimeFile() {

		Map<Integer, Crime> crimeFile = null;

		File f = new File("Crime.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {

				crimeFile = new LinkedHashMap<>();
				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
					oos.writeObject(crimeFile);
				}
				return crimeFile;

			} else {

				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
					crimeFile = (Map<Integer, Crime>) ois.readObject();
				}
				return crimeFile;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return crimeFile;
	}

	@SuppressWarnings("unchecked")
	public static Map<Integer, Criminal> CriminalFile() {

		Map<Integer, Criminal> CriminalFile = null;

		File f = new File("Criminal.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {
				
				CriminalFile = new LinkedHashMap<>();
				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
					oos.writeObject(CriminalFile);
				}
				return CriminalFile;

			} else {
				
				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
					CriminalFile = (Map<Integer, Criminal>) ois.readObject();
				}
				return CriminalFile;

			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
		return CriminalFile;

	}


}

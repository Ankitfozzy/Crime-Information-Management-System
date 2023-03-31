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

		Map<Integer, Crime> cFile = null;

		File f = new File("Crime.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {

				cFile = new LinkedHashMap<>();
				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
					oos.writeObject(cFile);
				}
				return cFile;

			} else {

				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
					cFile = (Map<Integer, Crime>) ois.readObject();
				}
				return cFile;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return cFile;
	}

	@SuppressWarnings("unchecked")
	public static Map<Integer, Criminal> CriminalFile() {

		Map<Integer, Criminal> cRFile = null;

		File f = new File("Criminal.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {
				
				cRFile = new LinkedHashMap<>();
				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
					oos.writeObject(cRFile);
				}
				return cRFile;

			} else {
				
				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
					cRFile = (Map<Integer, Criminal>) ois.readObject();
				}
				return cRFile;

			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
		return cRFile;

	}


}

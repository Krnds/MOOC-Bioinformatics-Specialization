package fr.karinedias.week1.utils;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportFile {

	/*
	 * Utilitary class for importing directly string data from a txt file or a fasta
	 * file
	 */
	
	String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public ImportFile(String filename) {
		this.filename = filename;
	}
	
	public static boolean askPath() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in the path of the file :");
		String pathname = sc.nextLine(); // using next or nextLine ?
		File f = new File(pathname);

		boolean exists = f.exists();

		return exists;
	}

	/**
	 * Open and read a file, and return the lines in the file as a list of Strings.
	 * (Demonstrates Java FileReader, BufferedReader, and Java5.)
	 */
	public ArrayList<String> readFile(String filename) {
		ArrayList<String> records = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				records.add(line);
			}
			reader.close();
			return records;
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
			return null;
		}
	}
}

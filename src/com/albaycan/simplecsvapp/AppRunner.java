package com.albaycan.simplecsvapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppRunner {
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Getting the choice
		System.out.println("Please select one of the following options to start:\n");
		System.out.println("       (1)Write to CSV\n");
		System.out.println("       (2)Read from CSV\n");
		int choice = input.nextInt();
		input.nextLine();
		
		//If Write to CSV choosen
		CSVWriter csvWriter = new CSVWriterImp("C:\\employees.csv");
		List<Employee> employees =new ArrayList<Employee>();
		
		Employee employee1 = new Employee(101, "Emma", "Andrews", 35, "Cornwall", "13/04/1984");
		Employee employee2 = new Employee(102, "Richard", "Money", 23, "Towcester", "03/09/1996");
		Employee employee3 = new Employee(103, "Jane", "Beale", 40, "London", "02/04/1979");
		Employee employee4 = new Employee(104, "Julie", "Metcalfe", 52, "Cambridge", "04/05/1967");
		Employee employee5 = new Employee(105, "Dawn", "Bettley", 20, "Oxford", "23/12/1999");
		Employee employee6 = new Employee(106, "Anthony", "Crabtree", 44, "Edinburgh", "28/10/1975");
		Employee employee7 = new Employee(107, "Sarah", "Booth", 70, "Bristol", "15/07/1949");
		Employee employee8 = new Employee(108, "Rita", "Moreton", 19, "Glasgow", "10/11/2000");
		Employee employee9 = new Employee(109, "Barry", "Emans", 28, "Costwold", "04/03/1991");
		Employee employee10 = new Employee(110, "Kellie", "Baker", 25, "Liverpool", "01/09/1994");
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);
		employees.add(employee8);
		employees.add(employee9);
		employees.add(employee10);
		
		List<CSVRow> csvRow = new ArrayList<CSVRow>();
		csvRow.addAll(employees);
		
		
		/* 		
		employees listesini List<CSVRow> listesine çevirsin. 
		csvWriter kullanarak dosyaya yazdırsın. 
		Ekrana “file saved successfully” yazsın
		*/
		
		//If Read from CSV choosen
		CSVReader csvReader = new CSVReaderImp("C:\\employees.csv");
		
		if(csvReader.readCSVRows()!=null) {
			csvReader.readCSVRows();
		} else System.out.println("No File Found");

		/*
		Dönen List<CSVRow> listesini List<Employee> tipinde bir listeye çevirsin.
		Ekrana tablo formatında tüm employee’lerin detaylarını yazsın.
		 */
		
		
	}

}

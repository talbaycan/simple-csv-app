package com.albaycan.simplecsvapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.albaycan.simplecsvapp.domain.Employee;
import com.albaycan.simplecsvapp.utility.CSVReader;
import com.albaycan.simplecsvapp.utility.CSVReaderImp;
import com.albaycan.simplecsvapp.utility.CSVRow;
import com.albaycan.simplecsvapp.utility.CSVWriter;
import com.albaycan.simplecsvapp.utility.CSVWriterImp;

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
		String filePath = "C:\\Users\\talba\\OneDrive\\Documents\\Projects\\simple-csv-app\\employees.csv";
		CSVWriter csvWriter = new CSVWriterImp(filePath);
		List<Employee> employees =new ArrayList<Employee>();
		
		Employee employee1 = new Employee(101, "Emma", "Andrews", 35, "Cornwall", LocalDate.of(1984, 04, 13));
		Employee employee2 = new Employee(102, "Richard", "Money", 23, "Towcester", LocalDate.of(1996, 12, 03));
		Employee employee3 = new Employee(103, "Jane", "Beale", 40, "London", LocalDate.of(1979, 04, 02));
		Employee employee4 = new Employee(104, "Julie", "Metcalfe", 52, "Cambridge", LocalDate.of(1967, 05, 04));
		Employee employee5 = new Employee(105, "Dawn", "Bettley", 20, "Oxford", LocalDate.of(1999, 12, 23));
		Employee employee6 = new Employee(106, "Anthony", "Crabtree", 44, "Edinburgh", LocalDate.of(1975, 10, 28));
		Employee employee7 = new Employee(107, "Sarah", "Booth", 70, "Bristol", LocalDate.of(1949, 07, 15));
		Employee employee8 = new Employee(108, "Rita", "Moreton", 19, "Glasgow", LocalDate.of(2000, 11, 10));
		Employee employee9 = new Employee(109, "Barry", "Emans", 28, "Costwold", LocalDate.of(1991, 03, 04));
		Employee employee10 = new Employee(110, "Kellie", "Baker", 25, "Liverpool", LocalDate.of(1994, 04, 01));
		
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
		
		List<CSVRow> csvRows = new ArrayList<CSVRow>();
		
		for(Employee employee : employees) {
			
			CSVRow csvRow = new CSVRow();
			csvRow.addRecord(String.valueOf(employee.getId()));
			csvRow.addRecord(employee.getName());
			csvRow.addRecord(employee.getSurname());
			csvRow.addRecord(String.valueOf(employee.getAge()));
			csvRow.addRecord(employee.getCity());
			csvRow.addRecord(String.valueOf(employee.getDOB()));
			
			csvRows.add(csvRow);
		}
				
		
		if(choice==1) {
		csvWriter.writeCSVFile(csvRows);
		System.out.println("File Saved Successfully");		
		} else if (choice==2) {
		
		
		//If Read from CSV choosen
		CSVReader csvReader = new CSVReaderImp(filePath);
		
		List<CSVRow> readCSVRows = null;
		
		if(csvReader.readCSVRows().size()==0) {
			System.out.println("No File Found");
		} else {
			readCSVRows = csvReader.readCSVRows();
		}				

		List<Employee> readEmployees =new ArrayList<Employee>();
		
		for(CSVRow readCSVRow :readCSVRows) {
			
			List<String> records = null;

			records = readCSVRow.getRecords();			
			
			Employee employee = new Employee();
			
			employee.setId(Integer.parseInt(records.get(0)));
			employee.setName(records.get(1));
			employee.setSurname(records.get(2));
			employee.setAge(Integer.parseInt(records.get(3)));
			employee.setCity(records.get(4));
			employee.setDOB(LocalDate.parse(records.get(5)));
			
			readEmployees.add(employee);
			
		}
		
		String leftAlignFormat = "%-5d | %-9s |  %-10s  | %-4s | %-11s  | %-9s   |%n";

		System.out.format(
				"------|-----------|--------------|------|--------------|--------------|%n");
		System.out.format(
				" Id   | Name      | Surname      | Age  | City         | DOB          |%n");
		System.out.format(
				"------|-----------|--------------|------|--------------|--------------|%n");

		for (Employee readEmployee : readEmployees) {
			System.out.format(leftAlignFormat, readEmployee.getId(), readEmployee.getName(), readEmployee.getSurname(), readEmployee.getAge(), 
					readEmployee.getCity(),readEmployee.getDOB());
		}
		
		}
		
	}

}

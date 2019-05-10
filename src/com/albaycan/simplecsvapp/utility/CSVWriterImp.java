package com.albaycan.simplecsvapp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriterImp implements CSVWriter{

	private String filepath;
	
	public CSVWriterImp(String filepath) {
		this.filepath = filepath;
	}

	
	@Override
	public void writeCSVFile(List<CSVRow> csvRows) throws Exception {
		
		FileWriter csvWriter=null;
		try {
			csvWriter = new FileWriter(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}  
		csvWriter.append("Id");  
		csvWriter.append(",");  
		csvWriter.append("Name");  
		csvWriter.append(",");  
		csvWriter.append("Surname");  
		csvWriter.append(",");  
		csvWriter.append("Age");
		csvWriter.append(",");
		csvWriter.append("City");
		csvWriter.append(",");
		csvWriter.append("DOB");
		csvWriter.append("\n");
		
	}

}

package com.albaycan.simplecsvapp.utility;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriterImp implements CSVWriter{

	private String filePath;
	//private String FILE_HEADER = "id,Name,Surname,Age,City, DOB";
	
	public CSVWriterImp(String filepath) {
		this.filePath = filepath;
	}
	
	@Override
	public void writeCSVFile(List<CSVRow> csvRows) {		
		
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);
			
			for(CSVRow csvRow:csvRows) {
				
				List<String> records = csvRow.getRecords();
				String strRow = String.join(",", records);
				fileWriter.append(strRow + "\n");
				
				/*String strRow = "";
				
				for(String record : records) {
					
					strRow = strRow + record + ",";					
				}				
				strRow = strRow.substring(0, strRow.length()-2); 
				fileWriter.append(strRow + "\n"); */
			}			
			
		} catch (IOException e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
            
           try {
               fileWriter.flush();
               fileWriter.close();
           } catch (IOException e) {
               System.out.println("Error while flushing/closing fileWriter !!!");
               e.printStackTrace();
           }
            
       } 
		
	}

}

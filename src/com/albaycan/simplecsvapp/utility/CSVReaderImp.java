package com.albaycan.simplecsvapp.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReaderImp implements CSVReader {

	private String filepath;
	
	public CSVReaderImp(String filepath) {
		this.filepath = filepath;		
	}
	
	@Override
	public List<CSVRow> readCSVRows() {		
		
		File csvFile = new File(filepath);  
		List<CSVRow> csvRows = new ArrayList<CSVRow>();

		if (csvFile.isFile()) {  
			
			BufferedReader csvReader = null;
			
			try {
				
				String line = "";
				csvReader = new BufferedReader(new FileReader(filepath));
				csvReader.readLine();
				
				while ((line = csvReader.readLine()) != null) {  
				    String[] fields = line.split(",");
				    
				    List<String> records = Arrays.asList(fields);
				    CSVRow csvRow = new CSVRow();				    
				    	    	    
				    csvRow.addRecords(records);
				} 
				
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				try {
					csvReader.close();  
				} catch  (Exception e) {
					e.printStackTrace();
				}
			}			
			
		}
		
		return csvRows;
	}

}

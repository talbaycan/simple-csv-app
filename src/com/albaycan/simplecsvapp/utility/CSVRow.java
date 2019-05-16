package com.albaycan.simplecsvapp.utility;

import java.util.ArrayList;
import java.util.List;

public class CSVRow {

	List<String> records;
	
	public CSVRow()
	{
		records = new ArrayList<String>();
	}
	
	public void addRecord(String record) {
		records.add(record);
	}
	
	
	void addRecords(List<String> records) {
	
		this.records.addAll(records);
	
	}
	
	
	public List<String> getRecords(){		
		
		return records;		
	}	
	
	@Override
	public String toString() {
		
		return null;
				
	}
}

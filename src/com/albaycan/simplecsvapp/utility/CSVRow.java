package com.albaycan.simplecsvapp;

import java.util.ArrayList;
import java.util.List;

public class CSVRow {

	List<String> records = new ArrayList<String>();
	
	void addRecord(String record) {
		records.add(record);
	}
	
}

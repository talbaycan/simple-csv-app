package com.albaycan.simplecsvapp;

import java.io.IOException;
import java.util.List;

public interface CSVWriter {

	void writeCSVFile(List<CSVRow> csvRows) throws Exception;
	
}

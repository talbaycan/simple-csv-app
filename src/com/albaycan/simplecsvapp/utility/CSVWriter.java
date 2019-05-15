package com.albaycan.simplecsvapp.utility;

import java.io.IOException;
import java.util.List;

public interface CSVWriter {

	void writeCSVFile(List<CSVRow> csvRows);
	
}

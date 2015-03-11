package com.craneprint.chickagent.tcp;

public class PrinterStatus {
	// A class with static final int's to represent distinct printer statuses, for internal and external(interpreted) consumption
	public static final int FAILED_TO_AUTHENTICATE_CODE = -3;
	public static final int UNKNOWN_ERROR_CODE = -2;
	public static final int FAILED_TO_CONNECT_CODE = -1;
	public static final int NO_DATA_CODE = 0;
	public static final int WAITING_CODE = 1;
	public static final int READY_CODE = 2;
	public static final int PRINTING_CODE = 3;
	
	public static String getStringForInt(int i){
		String result = "UNKOWN ERROR";
		if(i == FAILED_TO_AUTHENTICATE_CODE)
			result =  "FAILED TO AUTHENTICATE";
		else if(i == UNKNOWN_ERROR_CODE)
			result =  "UNKOWN ERROR";
		else if(i == FAILED_TO_CONNECT_CODE)
			result =  "FAILED TO CONNECT";
		else if(i ==  NO_DATA_CODE)
			result =  "NO DATA";
		else if(i == WAITING_CODE)
			result =  "WAITING";
		else if(i == READY_CODE)
			result =  "READY";
		else if(i == PRINTING_CODE)
			result =  "PRINTING...";
		return result;
	}
}

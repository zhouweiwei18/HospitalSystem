package com.web.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

	public static final String YEAR_FORMAT = "yyyy-MM-dd";
	
	public static Date strToDate(String dateTimeStr) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(YEAR_FORMAT);
		Date date = sdf.parse(dateTimeStr);
		return date;		
	}
	
	public static String dateToStr(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(YEAR_FORMAT);
		String str = sdf.format(date);
		return str;
	}
	
	public static boolean compare(String time1, String time2) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat(YEAR_FORMAT);

		Date a = sdf.parse(time1);
		Date b = sdf.parse(time2);

		if (a.before(b))
			return true;
		else
			return false;
	}
}

package Utility.Utility;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateFormat {

	public static void main(String[] args) {
		String dt="05-13-2020";
		addDaysToDate(dt ,65 );

	}
	
	public static void addDaysToDate(String strDate , int days)
	{

	DateTimeFormatter formatter = DateTimeFormat.forPattern("MM-dd-yyyy");
	DateTime dateTime = formatter.parseDateTime(strDate);

	DateTime oneDayPlus = dateTime.plusDays(days);
	String oneDayPlusString = oneDayPlus.toString(formatter);
	System.out.println(oneDayPlusString);

	}
	public static void addMonthToDate(String strDate , int month)
	{
		
	}

}

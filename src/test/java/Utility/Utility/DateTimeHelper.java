package Utility.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTimeHelper {

	public static void main(String[] args) throws ParseException {
		
		addDaysToSpecificDate("MM/dd/yyyy","06/16/2020",45);
	}

	public void getTodayDate()
	{
		String strDate  = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
	}
	public static void getTomorrowDate(String strFormat)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_YEAR, 1); 
		Date tomorrow = cal.getTime();
		String strTomorrow  = new SimpleDateFormat(strFormat).format(tomorrow);
		System.out.println(strTomorrow);
	}
	public static void getYesterdayDate(String strFormat)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_YEAR, -1); 
		Date tomorrow = cal.getTime();
		String strTomorrow  = new SimpleDateFormat(strFormat).format(tomorrow);
		System.out.println(strTomorrow);
	}
	public static void addDaysToCurrentDate(String strFormat , int noOfDays)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_YEAR, noOfDays); 
		Date tomorrow = cal.getTime();
		String strTomorrow  = new SimpleDateFormat(strFormat).format(tomorrow);
		System.out.println(strTomorrow);
	}
	public static void addDaysToSpecificDate(String strFormat , String strOldDate , int noOfDays) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(strOldDate));
		cal.add(Calendar.DAY_OF_YEAR, noOfDays); 
		Date tomorrow = cal.getTime();
		String strNewDate  = new SimpleDateFormat(strFormat).format(tomorrow);
		System.out.println(strNewDate);
	}
}

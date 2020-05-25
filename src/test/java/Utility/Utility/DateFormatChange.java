package Utility.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{

			   SimpleDateFormat sourceDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			   Date date = sourceDateFormat.parse("01-08-2018");
			   SimpleDateFormat targetDateFormat = new SimpleDateFormat("d-MM-yy");
			   System.out.println(targetDateFormat.format(date));

			   }catch(ParseException e){
			       e.printStackTrace();
			   }
			 }

	
	

}

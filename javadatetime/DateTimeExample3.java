package javadatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExample3 {
	public static void main(String args[])
	{
		//ISO Date
		LocalDate localDate=LocalDate.now(); //current date
		DateTimeFormatter dateFormatter=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localDate.format(dateFormatter));
		
		// yyyy/MM/dd pattern
		DateTimeFormatter dateFormatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(localDate.format(dateFormatter1));
		
		// MMM dd,yyyy pattern
		DateTimeFormatter dateFormatter2=DateTimeFormatter.ofPattern("MMM dd,yyyy");
		System.out.println(localDate.format(dateFormatter2));
		
		// dd-MMM-yyyy pattern
		DateTimeFormatter dateFormatter3=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(localDate.format(dateFormatter3));
		
		// dd-LL-yyyy pattern
		DateTimeFormatter dateFormatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
		System.out.println(localDate.format(dateFormatter4));
						
		
	}

}

package javadatetime;

import java.util.Calendar;

public class JavacalenderExample {
	public static void main(String args[])
	{
		Calendar calendar=Calendar.getInstance();//get current date
		System.out.println("The current date is :"+calendar.getTime());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15 days ago:"+calendar.getTime());//age 15 days
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4 months later:"+calendar.getTime());
		calendar.add(Calendar.YEAR, 2);
		System.out.println("2 years later:"+calendar.getTime());
		System.out.println("At present calendar's year:"+calendar.get(Calendar.YEAR));
		System.out.println("At present calendar's day:"+calendar.get(Calendar.DATE));
		System.out.println("At present Date and Time is:"+calendar.getTime());
		int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);//get maximum day of week
		System.out.println("Maximum number of days in week:"+ maximum);
		maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);//maximum week of year
		System.out.println("Maximum number of weeks in year:"+ maximum);
		int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in week:"+ minimum);
		minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks in year:"+ minimum);
		
	}

}

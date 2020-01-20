package javadatetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
import java.time.*;

public class MonthDayExample {
	public static void main(String args[])
	{
		MonthDay month=MonthDay.now();
		LocalDate date=month.atYear(2020);
		System.out.println(date);
		boolean a=month.isValidYear(2018);//boolean value is used tho check year is valid or not
		System.out.println(a);
		long b=month.getLong(ChronoField.MONTH_OF_YEAR);//Get the  month of the year
		System.out.println(b);
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);//get the range 1-12
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);//range is 1-31 
		System.out.println(r2);
		
		
	}

}

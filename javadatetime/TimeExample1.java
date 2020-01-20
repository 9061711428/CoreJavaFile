package javadatetime;

import java.time.LocalTime;

public class TimeExample1 {
	public static void main(String args[])
	{
	//Current time
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		//Specific time
		LocalTime localTime2=LocalTime.of(4,30,45);
		System.out.println(localTime2);
		System.out.println("Hour :"+localTime.getHour());
		System.out.println("Minute :"+localTime.getMinute());
		System.out.println("Second :"+localTime.getSecond());
		//LocalTime's plus methods
		System.out.println("Addition for Hours :"+localTime.plusHours(2));
		System.out.println("Addition for minutes :"+localTime.plusMinutes(30));
		System.out.println("Addition for seconds :"+localTime.plusSeconds(20));
		System.out.println("Addition for Nanos :"+localTime.plusNanos(60000));
		
		//LocalTime's minus methods
		System.out.println("Subtraction for Hours :"+localTime.minusHours(2));
		System.out.println("Subtraction for minutes :"+localTime.minusMinutes(30));
		System.out.println("Subtraction for seconds :"+localTime.minusSeconds(20));
		System.out.println("Subtraction for Nanos :"+localTime.minusNanos(60000));
		
		LocalTime localTime3=LocalTime.of(11,45,20);
		//compareTo() example
		if(localTime.compareTo(localTime2)==0)
		{
			System.out.println("localDate1 and localDate2 are equal");
			
		}
		else
		{
			System.out.println("localDate1 and localDate2 are not equal");
		}
		
		//isBefore() Example
		if(localTime2.isBefore(localTime3))
		{
			System.out.println("localTime2 comes before localTime3");
		}
		
		//isAfter() Example
		if(localTime3.isAfter(localTime))
		{
		System.out.println("localTime3 comes After localTime1");
		}
				
	}

}

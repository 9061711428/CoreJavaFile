package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListCustomerRegistration1 {
	public static void main(String args[])
	{
	String name;
	String address;
	String ph;
	String email;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	Scanner ob=new Scanner(System.in);
	List<User> list=new ArrayList<User>();
	User user=new User();
	User user1=new User();
	int id=1,i = 0;
	int r,date,s=1,d1,d2;
	String op1,op2,op3;
	do {
	System.out.print("1.Registration\n2.View\n3.Exit\n");
	r=ob.nextInt();
	switch(r)
	{
	case 1:
	System.out.println("Enter your name:");
	String n=ob.next();
	System.out.println("Enter your address:");
	String a=ob.next();
	System.out.println("Contact Number:");
	String p=ob.next();
	System.out.println("Email ID:");
	String e=ob.next();
	
	System.out.println("Thank you for registering.Your id is :"+id);
	System.out.println("Do you want to Book a room (yes/no)");
	op2=ob.next();
	if(op2.equals("yes"))
	{
	System.out.println("Please choose the services required\n.AC/non-AC (Enter AC/nAC) :");
	ac=ob.next();
	System.out.println(".Cot(Enter Single/Double) :");
	cot=ob.next();
	System.out.println(".With cable connection/without cable connection(Enter C/nC) :");
	cable=ob.next();
	System.out.println(".Wi-Fi needed or not(Enter W/nW) :");
	wifi=ob.next();
	System.out.println(".Laundry service needed or not(Enter L/nL) :");
	laundry=ob.next();
	//System.out.println("Enter the date of booking");
	//date=ob.nextInt();*/
	list.add(user);
	user.setid(id);
	user.setname(n);
	user.setaddress(a);
	user.setph(p);
	user.setemail(e);
	user.setac(ac);
	user.setcot(cot);
	user.setcable(cable);
	user.setwifi(wifi);
	list.add(user1);
	user1.setid(id);
	user1.setname(n);
	user1.setaddress(a);
	user1.setph(p);
	user1.setemail(e);
	
	user1.setac(ac);
	user1.setcot(cot);
	user1.setcable(cable);
	user1.setwifi(wifi);	System.out.println("Do you want to proceed (yes/no)");
	op3=ob.next();
	if (op3.equals("yes"))
	System.out.println("Thank you for Booking Your Room Number is "+s);
	s++;
	}
	else
	{
	System.out.println("Thank You");

	}

	i++;
	id++;
	break;
	case 2:System.out.println("View all bookings:");
	    /*  System.out.println("Enter the start date");
	       d1=ob.nextInt();
	       System.out.println("Enter the end date");
	       d2=ob.nextInt();
	       System.out.println("The bookings made from "+d1+" to "+d2+" are");
	       System.out.println("Room number\t\tcustomer ID");
	       for(j=0;j<i;j++)
	       {
	     
	      if(d[j].date>=d1&&d[j].date<=d2)
	      {
	      d[j].viewbook();
	      }
	       }*/
	for(int j=0;j<list.size();j++) {
		System.out.println(list.get(j).getid());
		System.out.println(list.get(j).getname());

	}
	break;
	case 3:
	System.exit(0);
	
	System.out.println("Do you want to continue (yes/no)");
	       op1=ob.next();
	}while(op1.equals("yes"));

	
	}
	



	
	
	


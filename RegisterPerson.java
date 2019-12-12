package myprogramz;

import java.util.Scanner;

public class RegisterPerson {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofTyp;
	String proofID;
	
	public static void main(String[] args) {
		RegisterPerson obj=new RegisterPerson();//Create Object
		int id=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		obj.name=sc.nextLine();
		System.out.println("Enter your address ");
		obj.address=sc.nextLine();
		System.out.println("Enter your contact number ");
		obj.contactNumber=sc.nextLine();
		System.out.println("Enter your email ");
		
		obj.email=sc.nextLine();
		
		System.out.println("Enter your proof type ");
		obj.proofTyp=sc.nextLine();
		
		System.out.println("Enter your proofid ");
		obj.proofID=sc.nextLine();
		
		
		System.out.println("Your name is\t\t: "+obj.name);
		System.out.println("Your address is\t\t: "+obj.address);
		System.out.println("Your contact number is\t: "+obj.contactNumber);
		System.out.println("Your email is \t\t: "+obj.email);
		System.out.println("Your proofType is \t: "+obj.proofTyp);
		System.out.println("Your proofId is \t: "+obj.proofID);
		
		System.out.println("Thank you for registering. Your id is "+id);
		id++;
		
		
		
		// TODO Auto-generated method stub
		}
}
		
	






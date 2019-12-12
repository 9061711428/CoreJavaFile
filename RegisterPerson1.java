package myprogramz;
import java.util.Scanner;

public class RegisterPerson1 {


	String name;
	String address;
	String contactNumber;
	String email;
	String proofTyp;
	String proofID;
	
	public RegisterPerson1(String name, String address, String contactNumber, String email, String proofTyp, String proofID)
	{
		this.name=name;  //Consturctor of RegisterPerson1
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofTyp=proofTyp;
		this.proofID=proofID;
	}
	
	void Register(String name, String address, String contactNumber, String email, String proofTyp, String proofID)
	{
		int id=0;
		id++;
		
		System.out.println("Your name is\t\t: "+name);
		System.out.println("Your address is\t\t: "+address);
		System.out.println("Your contact number is\t: "+contactNumber);
		System.out.println("Your email is \t\t: "+email);
		System.out.println("Your proofType is \t: "+proofTyp);
		System.out.println("Your proofId is \t: "+proofID);
		
System.out.println("Thank you for registering. Your id is "+id);
	}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String name;
		System.out.println("Enter your name ");
		name=sc.nextLine();
		System.out.println("Enter your address ");
		String address;
		//System.out.println("Enter your contact number ");
		address=sc.nextLine();
		System.out.println("Enter your contact number ");
		String contactNumber;
		
		contactNumber=sc.nextLine();
		System.out.println("Enter your email ");
		String email;
		email=sc.nextLine();
		String proofTyp;
		System.out.println("Enter your proof type ");
		proofTyp=sc.nextLine();
		String proofID;
		System.out.println("Enter your proofid ");
		proofID=sc.nextLine();
		RegisterPerson1 obj=new RegisterPerson1(name,address,contactNumber,email,proofTyp,proofID);
		obj.Register(name,address,contactNumber,email,proofTyp,proofID);
		
		sc.close();
	}

}


package compareable;
import java.util.Scanner;

public class CaseStudyCollection {
		String name;
		String address;
		String contactNumber;
		String email;
		String prooftype;
		String proofid;
		
		public CaseStudyCollection(String name, String address, String contactNumber, String email, String prooftype, String proofid)
		{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.prooftype=prooftype;
		this.proofid=proofid;

		}

		void Register(String name, String address, String contactNumber, String email, String proofType, String proofid)
		{
		int id=1;
		id++;
		System.out.println("your name is :"+name);
		System.out.println("your address is :"+address);
		System.out.println("your contact Number is :"+contactNumber);
		System.out.println("your email is :"+email);
		System.out.println("your proof type is :"+prooftype);
		System.out.println("your proof id is :"+proofid);
		System.out.println("Thank you for registering. Your id is "+id);
		}
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);

		System.out.println("Registration");
		System.out.println("Enter your name");
		String name;
		name=obj.nextLine();
		System.out.println("Enter your address");
		String address;
		address=obj.nextLine();
		System.out.println("Contact Number ");
		String contactNumber;
		contactNumber=obj.nextLine();
		System.out.println("E-Mail ID");
		String email;
		email=obj.nextLine();
		System.out.println("Enter proof type");
		String prooftype;
		prooftype=obj.nextLine();
		System.out.println("Enter proof id");
		String proofid;
		proofid=obj.nextLine();
		CaseStudyCollection obj1=new CaseStudyCollection(name,address,contactNumber,email,prooftype,proofid);
		obj1.Register(name,address,contactNumber,email,prooftype,proofid);
		obj.close();
		}

		
		
		} 



}

package myprogramz;
import java.util.Scanner;
public class Encapuslation1 {
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=sc.nextLine();
		System.out.println("Enter your address ");
		String address=sc.nextLine();
		System.out.println("Enter your contact number ");
		String contactNumber=sc.nextLine();
		System.out.println("Enter your email ");
		
				
		String email=sc.nextLine();
		
		System.out.println("Enter your proof type ");
		String proofTyp=sc.nextLine();
		
		System.out.println("Enter your proofid ");
		String proofID=sc.nextLine();
		corejavagetname obj=new corejavagetname();
		obj.setname(name);
		obj.setaddress(address);
		obj.setcontactNumber(contactNumber);
		obj.setemail(email);
		obj.setproofTyp(proofTyp);
		obj.setproofID(proofID);
		
		System.out.println("name is\t:"+obj.getname());
		System.out.println("address is\t:"+obj.getaddress());
		System.out.println("contact is\t:"+obj.getcontactNumber());
		System.out.println("Email is\t:"+obj.getemail());
		System.out.println("proof type is\t:"+obj.getproofTyp());
		System.out.println("proof id is\t:"+obj.getproofID());
		System.out.println("Thankyou for registration.Your ID is 1");
		
		}

	}




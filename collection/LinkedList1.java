package collection;

import java.util.*;
public class LinkedList1 {
	 
		 public static void main(String args[])
		 {
			 
		 String ac;
		 String cot;
		 String cable;
		 String wifi;
		 String laundry;
		 int date=0,d1,d2;

		 Scanner ob=new Scanner(System.in);
		 int r;
		 String op1,op2,op3,op4;
		 List<User1>list=new LinkedList<User1>();
		 //casehotelbook d[]=new casehotelbook[20];
		 int i=0,s=101,k=0,j;
		 int id=1;
		 do {
		 System.out.print("1.Registration\n2.View\n3.Exit\n");
		 r=ob.nextInt();
		 switch(r)
		 {
		 case 1:
		 do
		 {
		 System.out.println("Enter your name:");
		 String n=ob.next();
		 System.out.println("Enter your address:");
		 String a=ob.next();
		 System.out.println("Contact Number:");
		 String p=ob.next();
		 System.out.println("Email ID:");
		 String e=ob.next();
		 System.out.println("Enter proof type:");
		 String pt=ob.next();
		 System.out.println("Enter proof id:");
		 String pi=ob.next();
		 //c[i]=new email();
		 //c[i].register(id,n,a,p,e,pt,pi)
		 System.out.println("Thank you for registering.Your id is :"+id);

		 User1 S=new User1(id,n,a,p,e,pt,pi);
		 list.add(S);
		 id++;
		 i++;
		 System.out.println("Do you want to continue registration (yes/no)");
		 op4=ob.next();
		 }while(op4.equals("yes"));
		 break;
		 case 2:
		 System.out.println("enter your id");
		 int lid=ob.nextInt();
		       for(j=0;j<list.size();j++)
		       {
		       if(lid==(list.get(j).getid()))
		       {
		       System.out.println(list.get(j).getid());
		       System.out.println(list.get(j).getname());
		       System.out.println(list.get(j).getaddress());
		       System.out.println(list.get(j).getph());
		       System.out.println(list.get(j).getemail());
		       System.out.println(list.get(j).getptype());
		       System.out.println(list.get(j).getpid());
		       }
		         else
		       {
		       System.out.println("Invalid entry");
		       break;
		           }
		        }
		      
		      
		 case 3:
		 System.exit(0);
		 }
		 System.out.println("Do you want to continue (yes/no)");
		       op1=ob.next();
		 }while(op1.equals("yes"));
		 }
		 }



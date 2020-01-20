package collection;//contin.. linkedlist1

import java.util.Scanner;

public class User1 {
	int id;
	String name;
	String address;
	String ph;
	String email;
	String ptype;
	String pid;
	User1(int id,String name,String address,String ph,String email,String ptype,String pid)
	{
	this.id=id;
	this.name=name;
	this.address=address;
	this.ph=ph;
	this.email=email;
	this.ptype=ptype;
	this.pid=pid;
	}
	//public static int i=1;
	/*public void register(int id,String n,String a,String p,String e,String pt,String pi)
	{
	Scanner ob=new Scanner(System.in);
	String op1,op2;
	this.name=n;
	this.address=a;
	this.ph=p;
	this.email=e;
	this.ptype=pt;
	this.pid=pi;
	this.id=id;
	}//i++;*/
	   String getname()
	   {
	    return this.name;
	   }
	   String getaddress()
	   {
	    return this.address;
	   }
	   String getph()
	   {
	    return this.ph;
	   }
	   String getemail()
	   {
	    return this.email;
	   }
	   String getptype()
	   {
	    return this.ptype;
	   }
	   String getpid()
	   {
	    return this.pid;
	   }
	   int getid()
	   {
	    return this.id;
	   }
	}



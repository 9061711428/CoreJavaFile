package temp;
import java.io.Console;
public class ConsoleClassExample {
	public static void main(String args[])
	{
		String str;
		Console con=System.console();//create Console class object
		if(con==null)
		{
			System.out.print("No console avilable");
			return;
			
		}
		str=con.readLine("Enter your name");
		System.out.print(str);
		System.out.print("Enter password");
		char[] ch=con.readPassword();//character array 
		String pass=String.valueOf(ch);
		System.out.print("Password is:"+pass);
		
		}

}

package temp;
import java.io.*;
public class BufferedReaderExamp {
	public static void main(String args[]) throws IOException
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Using BufferedReader 
		float a=Float.parseFloat(br.readLine());//Read float value
		double b=Double.parseDouble(br.readLine());//Read Double value
		System.out.print(a+"\n"+b);
		
		}
		catch(Exception e)
		{
		}
		
	}

}
                
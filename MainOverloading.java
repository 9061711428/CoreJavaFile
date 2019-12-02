package myprogramz;
import java.util.Scanner;
class Area
{
	public void findarea(int side)
	{
		System.out.println("Area of square is :"+(side*side));
	}
	public void findarea(float base,float height)
	{
		float tg=(float)(0.5*base*height);
		System.out.println("Area of triangle is:"+tg);
	}
	public void findarea(int base,int height)
	{
		System.out.println("Area of rectangle is :"+(base*height));
	}
	public void findarea(float radius)
	
	{
		float v=(float)3.14*radius*radius;
		System.out.println("Area of rectangle is"+(v));
	}
	
	
}

public class MainOverloading {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		Area area=new Area();
		area.findarea(10);
		area.findarea(5.0f,5.0f);
		area.findarea(15,15);
		area.findarea(10.2f);
		
		
		
		
	}
	

}

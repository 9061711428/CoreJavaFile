package sets;
public class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	public String getName()//get name
	{
		return name;		
	}
	public void setName(String name)//set name
	{
		this.name=name;
	}
	public int getAge()//get age
	{
		return age;
	}
	public void setAge(int age)//set age
	{
		this.age=age;
	}
	/*public int compareTo(Employee e) 
	{	
		if(age>e.getAge())
	{
		return 1;
	}
	else if(age<e.getAge())
	{
	return -1;
	}*/
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 1;
	}
		
	}




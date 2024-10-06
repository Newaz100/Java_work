public class Driver extends Car
{
	private String name;
	private double dnumber;
	
	public Driver()
	{
		System.out.println("DRIVER CLASS CONSTRUCTOR 2");
		System.out.println("");
	}
	public Driver(String n,double dnumber)
	{
		name=n;
		this.dnumber=dnumber;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setDnumber(double dnumber)
	{
		this.dnumber=dnumber;
	}
	public String getName()
	{
		return name;
	}
	public double getDnumber()
	{
		return dnumber;
	}
	public void display()
	{		
		System.out.println("DRIVER CLASS DRIVER DISPLAY");
		System.out.println("");
	}
	public void display2()
	{
		System.out.println("DRIVER CLASS DRIVER DISPLAY-2");
		System.out.println("");
	}
}
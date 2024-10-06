import java.lang.*;
public class Car
{
	private String name;
	private String modelNumber;
	
	public Car()
	{
		System.out.println("CAR CLASS CONSTRUCTOR 1");
		System.out.println("");
		
	}
	public Car(String name)
	{
		this.name=name;
	}
	public Car(String name,String modelNumber)
	{
		this.name=name;
		this.modelNumber=modelNumber;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setModelNumber(String modelNumber)
	{
		this.modelNumber=modelNumber;
	}
	public String getName()
	{
		return name;
	}
	public String getModelNumber()
	{
		return modelNumber;
	}
	public void display()
	{
		System.out.println("CAR CLASS CAR DISPLAY");
		System.out.println("");
	}
	public void display1()
	{
		System.out.println("CAR CLASS CAR DISPLAY-1");
		System.out.println("");
	}
}
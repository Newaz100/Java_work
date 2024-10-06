import java.lang.*;

public class FixedAccount extends Account
{
	private double interestRate;
    private int year;
	
    public FixedAccount()
	{
		
	}
    public FixedAccount(String ana,String ano,double ba,double ir)
	{
		super(ana,ano,ba);
		interestRate=ir;
	}
    public void setInterestRate(double ir)
	{
		interestRate=ir;
	}
    public double getInterestRate() 
	{
		return interestRate;
	}
    public void setYear(int y)
	{
		year=y;
	}
    public int getYear()
	{
		return year;
	}
    public void calculateInterestAmount()
   {
	   double  x=getBalance();
	   double ir=interestRate*year*x;
	   System.out.println("Total interest amount is: "+ir);
   }
   
   public void showAll()
   {
	   
	   showAccount();
	   System.out.println("Interest Rate is : "+interestRate);
	   System.out.println("Year is : "+year);
	   calculateInterestAmount();
	}

}
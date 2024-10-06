import java.lang.*;

public class Account
{
   private 	String accountName;
   private String accountNumber;
   private double balance;
   
   
   public Account()
   {
	   
   }
   
   public Account(String ana,String ano,double ba)
   {
	   accountName=ana;
	   accountNumber=ano;
	   balance=ba;
   }
   public void setAccountName(String ana)
   {
	   accountName=ana;
   }
   public void setAccountNumber(String ano)
   {
	   accountNumber=ano;
   }
   public void setBalance(double ba)
   {
	   balance=ba;
   }
   
   public String getAccountName()
   {
	   return accountName;
   }
   public String getAccountNumber()
   {
	   return accountNumber;
   }
   public double getBalance()
   {
	   return balance;
   }
   public void showAccount()
   {
	   System.out.println("Account name: "+accountName);
	   System.out.println("Account Number is : "+accountNumber);
	   System.out.println("Balance  is : "+balance);
   }
}
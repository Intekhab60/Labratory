//    WAP to print a Bank Transition.

package basic;
import java.util.Scanner;

public class Bank 
{
	public static int withdral(int total, int amt)
	{
		int result= total;
		if(total>= amt)
		{
			result= total-amt;
		
		}
		else
		{
			System.out.println("error: You don't have enough balance. ");
		}
		return result;
	}
	public static int deposit(int total, int amt)
	{
		int result = total+amt;
		return result;
	}
	public static int checkbal(int total)
	{
		int result = total;
		return result;
	}
	public static void main (String[] args)
	{
		int choice,cbal,bal,res;
		Scanner Sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter a Operation");
			System.out.println("1)Withdral\n2)Deposit\n3)checkbal\n4)Exit");
			choice= Sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Current Balance:");
				cbal= Sc.nextInt();
				System.out.println("Enter the amount you want to withdral:");
				bal= Sc.nextInt();
				res= Bank.withdral(cbal,bal);
				System.out.println("Total Balance is :"+" = "+res);
				break;
			case 2:
				System.out.println("Enter the Current Balance:");
				cbal= Sc.nextInt();
				System.out.println("Enter the amount you want to Deposit:");
				bal= Sc.nextInt();
				res= Bank.deposit(cbal,bal);
				System.out.println("Total Balance is :" +" = "+res);
				break;
			
			case 3:	
				System.out.println("Enter the Current Balance:");
				cbal= Sc.nextInt();
				res= Bank.checkbal(cbal);
				System.out.println("Your Current Total Balance is :" +" = "+res);
				break;
			case 4:
				System.exit(0);
			}
		}
		while(choice!=4);
	}
}
   

// Calculate the value of two numbers using SWITCH case

package basic;
import java.util.Scanner;
public class Calculator 
{
	public static int addition(int a, int b)
	{
		int result = a+b;
		return result;
	}
	public static int subtraction(int a, int b)
	{
		int c;
		if(a>b)
		{
			c = a-b;
		}
		else
		{
			c = b-a;
		}
		return c;
		
	}
	public static int multiplication(int a, int b)
	{
		int m;
		m = a*b;
		return m;
	}
	public static float division(float a, float b)
	{
		float d;
		d = a/b;
		return d;
	}
	public static void main (String[] args) 
	{
		int choice,num1,num2;
		float res;
		
        Scanner Sc= new Scanner(System.in);
		do{                  
		System.out.println("Enter the Operation");
		System.out.println("1)Addition \n2)Subtraction \n3)Multiplication\n4)Division\n5)Exit");    
		choice = Sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter first digit");
			num1= Sc.nextInt();
			System.out.println("Enter second digit");
			num2= Sc.nextInt();
			res= Calculator.addition(num1,num2);
			System.out.println("Result is:\n"+num1+"+"+num2+" = "+res);
		    break;
		
		case 2:
			System.out.println("Enter first digit");
			num1= Sc.nextInt();
			System.out.println("Enter second digit");
			num2= Sc.nextInt();
			res= Calculator.subtraction(num1,num2);
			System.out.println("Result is:\n"+num1+"-"+num2+" = "+res);
			break;
		
		case 3:
			System.out.println("Enter first digit");
			num1= Sc.nextInt();
			System.out.println("Enter second digit");
			num2= Sc.nextInt();
			res= Calculator.multiplication(num1,num2);
			System.out.println("Result is:\n"+num1+"*"+num2+" = "+res);
			break;
			
		case 4:
			System.out.println("Enter first digit");
			num1= Sc.nextInt();
			System.out.println("Enter second digit");
			num2= Sc.nextInt();
			res= Calculator.division(num1,num2);
			System.out.println("Result is:\n"+num1+"/"+num2+" = "+res);
			break;
				
		case 5:
			System.exit(0);
		      
		}
		}
		while(choice!=5);           
	}
}

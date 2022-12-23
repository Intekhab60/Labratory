//WAP to check wheather a number is a amstrong number or not.

 package basic;

import java.util.Scanner;

public class AmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		int num,rem,sum=0,temp;  		
		System.out.println("Enter the number:");    
		num =Sc.nextInt();
		   
		temp=num;    
		while(num>0)    
		{    
			rem=num%10;    
			sum=sum+(rem*rem*rem);    
			num=num/10;
		}    
		if(temp==sum)    
		System.out.println(temp+" is a armstrong  number.");    
		else    
		System.out.println(temp+" is not a armstrong number."); 
	}

} 

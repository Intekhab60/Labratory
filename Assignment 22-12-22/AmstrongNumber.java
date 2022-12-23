//WAP to check wheather a number(of any digits) is a amstrong number or not.

  package basic;

import java.util.Scanner;

public class AmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		int i,num,rem,sum=0,temp,temp1,count=0;  		
		System.out.println("Enter the number:");    
		num =Sc.nextInt();
		   
		temp=temp1=num;
		while(temp1>0)
		{
			count=count+1;
			temp1=temp1/10;
		}

		System.out.println("Numbers of Digit of "+temp+" is "+count);
		while(num>0)    
		{    
			rem=num%10;    
			sum=sum+(int)Math.pow(rem,count);  
			num=num/10;
		}    
		if(temp==sum)    
		System.out.println(temp+" is a armstrong  number.");    
		else    
		System.out.println(temp+" is not a armstrong number."); 
	}

} 

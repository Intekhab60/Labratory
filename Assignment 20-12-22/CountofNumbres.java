// WAP to Count the digits of a number

package oops;

import java.util.Scanner;

public class CountofNumbres {
	public static void main(String[] args)
	{
		Scanner Sc= new Scanner(System.in);
		int num,temp,i;
		System.out.println("Enter a Number");
		num = Sc.nextInt();
		temp=num;
		for(i=0;num!=0;i++)
		{
			num= num/10;
			
		}
		System.out.println("No. of Digits of "+temp+" is "+i);
	}
}

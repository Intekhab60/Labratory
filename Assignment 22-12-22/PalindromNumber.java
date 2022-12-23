// WAP to check whether a number is a palindrome pr not

package basic;
import java.util.Scanner;
public class PalindromNumber 
{
	public static void main(String args[])
	{  
		Scanner Sc = new Scanner(System.in);
		int n,r,sum=0,temp;   
		System.out.println("Enter the Number:");
		n= Sc.nextInt();	  
		  temp=n;    
		  while(n>0)
		  {    
			  r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp+" is a palindrome number ");    
		  else    
		   System.out.println(temp+" is not a palindrome");    
		}  
}

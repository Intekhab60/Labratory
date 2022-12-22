// WAP to check wheather a number is a palindrome pr not

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
		int actual=n; 		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(actual+" is a palindrome number ");    
		  else    
		   System.out.println(actual+" is not a palindrome");    
		}  
}

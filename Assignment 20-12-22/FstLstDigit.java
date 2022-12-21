// WAP to print First and last Digits of a number

package oops;
import java.util.Scanner;
public class FstLstDigit 
{ 
	
	   public static void main(String args[])
	   {
	      Scanner sc=new Scanner(System.in);
	      int number,firstDigit,lastDigit;
	      System.out.println("Enter a number: ");
	      number = sc.nextInt();
	      int temp = number;
	      
	      firstDigit=0;
	      lastDigit=0;
	      
	      
	      lastDigit=number%10;
	      for(;number>=10;)
	      {
	    	  number=number/10;
	    	  firstDigit=number;
	      }
	 
	      System.out.println("First digit of number: "+firstDigit );
	      System.out.println("Last digit of number: "+ lastDigit);
	     
	   }
	

}

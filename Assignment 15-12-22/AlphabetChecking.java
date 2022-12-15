//WAP to check whether a char is an alphabet or not.

package basic;
import java.util.Scanner;
public class AlphabetChecking
 {
   public static void main(String[] args)
   {
	 Scanner Sc= new Scanner(System.in);
	 char c;
	 System.out.println("Enter a Character:");
	 c = Sc.next().charAt(0);
	 if((c>='a' && c<='z') ||(c>='A' && c<='Z'))
	 {
	   System.out.println("The character is an Alpahbet");
	 }
	 else
	 {
	  System.out.println("The character is not an Alpahbet"); 
	 }
   }
 }

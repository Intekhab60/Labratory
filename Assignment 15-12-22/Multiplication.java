// WAP to multiplication two values

package basic;
import java.util.Scanner;
public class Multiplication 
{
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter a Number:");
		a = Sc.nextInt();
		System.out.println("Enter another Number:");
		b = Sc.nextInt();
			System.out.println("The Result is: "+(a*b));
	}

}

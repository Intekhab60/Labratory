// WAP to calcuate value


package basic;
import java.util.Scanner;
public class Calculate 
{
	public static int addition(int a, int b)
	  {
		int result;
		result = a + b;
		return result;
	  }
	
	public static int subtraction(int a , int b)
	  {
		int result = a - b;
		return result;
	  }
	
	public static int multiplication(int a, int b)
	  {

		int result = a * b;
		return result;
	  }
			
	public static float division(float a, float b)
	  {
		float div = a / b;
		return div;
	  }
	public static void main(String[] args)
	  {		
		int res,choice;
		float divi;
		Scanner Sc = new Scanner(System.in);
        do
		 {
			System.out.println("Enter a Operation:");
			System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Exit");
			choice = Sc.nextInt();
			switch(choice)
			{
			case 1:
				res = Calculate.addition(10, 15);
				System.out.println("The Sum is : "+res);
				break;
			
			case 2:
				res=Calculate.subtraction(4, 7);
				System.out.println("The Result is : "+res);
				break;
				
			case 3:
				res=Calculate.multiplication(8, 9);
				System.out.println("The Result is : "+res);
				break;
				
			case 4:
				divi=Calculate.division(9, 2);
				System.out.println("The Result is : "+divi);
				break;	
			case 5:
				System.exit(0);
			}
		}
		while(choice != 5);		
	  }
}		

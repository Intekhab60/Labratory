

package basic;
import java.util.Scanner;
public class EvenSum 
{
	public static void main(String[] args)
	{
	Scanner Sc= new Scanner(System.in);
	int range,sum=0;
	System.out.println("Enter a Range:");
	range= Sc.nextInt();
	System.out.print("Even Numbers are: ");
	for(int i=1;i<=range;i++)
	  {
		if(i%2==0)
		{
			System.out.print(" "+i);
			sum=sum+i;
		}
		
	  }
	System.out.println("\nSum of all Even No is: "+sum);
	}
}


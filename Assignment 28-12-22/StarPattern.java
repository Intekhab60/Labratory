// WAP to print *****    pattern.
                 ****
                  ***
                   **
                    *


package basic;
public class StarPattern
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//outer loop
		   {
				for(int j=1;j<=5;j++)//inner loop
					{
						if(j<=i-1)
						System.out.print(" ");
						else
						System.out.print("*");
			}
			System.out.println();
		   }		

	    }
}

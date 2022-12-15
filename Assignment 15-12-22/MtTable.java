//WAP to show multiplication table of a value

package basic;
import java.util.Scanner;
public class MtTable 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("Enter a number :");
	    num= sc.nextInt();		
		System.out.println("The muliplication table is ");
		for(int i=1;i<=10;i++) {
		System.out.println(num+"*"+i+" = "+(num*i));
		}
	}
}

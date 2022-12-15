// WAP to check whether a number is divisible by both 5 and 11

package basic;
import java.util.Scanner;
public class Divisible
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the number:  ");
        num=Sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("The number is divisible by both 5 and 11");
        }
        else
        {
            System.out.println("The number is not divisible by both 5 and 11");
        }
    }
}

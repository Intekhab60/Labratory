//WAP to print Factorial Number of 1 to 10

package basic;
public class Factorial
{
    public static void main(String args[])
    {
        int num,Factor=1;
        System.out.println("  Factorial Number");
        for(num=1;num<=10;num++)
        {
        	Factor=Factor*num;
            System.out.println("Factorial of "+num+" is: "+Factor);
        }
    }
}

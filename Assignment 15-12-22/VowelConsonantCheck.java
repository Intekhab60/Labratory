// WAP to check whether a char. is a vowel or consonant
package basic;
import java.util.Scanner;
public class VowelConsonantCheck 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter the character: ");
        c=sc.next().charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                System.out.println("The charater is a vowel");
            }
            else
            {
                System.out.println("The character is a consonant");
            }
	
	}

}

package restourantmanagement;

import java.util.Scanner;

public class Restourant1 {
	double biriyanicombo=200.00;
	double chinesecombo=350.00;
	double badaplatter=150.00;
	double kababplatter=250.00;
	double steammomo=100.00;
	double panfriedmomo=120.00;
	int ch,count=0;
	static int index=0;
	double total_price=0;
	Scanner sc=new Scanner(System.in);
	String a;
	static Restourant3 res[]=new Restourant3[30];//array with class name
	
  //method to show available foods
	
  public void menu()
	{
		System.out.println("*************WELCOME TO BANERJEE RESTOURANT****************");
		System.out.println(" ID         ITEM                        PRICE ");
		System.out.println("----   ------------------              -------- ");
		System.out.println(" 1.    BIRIYANI COMBO                  200.00");
		System.out.println(" 2.    CHINESE COMBO                   350.00");
		System.out.println(" 3.    BADA PLATTER                    150.00");
		System.out.println(" 4.    KABAB PLATTER                   250.00");
		System.out.println(" 5.    STEAM MOMO(6pcs)                100.00");
		System.out.println(" 6.    PANFRIED MOMO(6pcs)             120.00");
		System.out.println("");
	
  }
	//method for order food by their id
	
  public void order()
	{
		while(true) {
		System.out.print("Enter the food Id: ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.print("Please enter the quantity of your BRIYANI COMBO: ");
				count=sc.nextInt();
				total_price+=count*biriyanicombo;
				res[index]=new Restourant3("BIRIYANI COMBO", count, total_price);
				index++;
				total_price=0;
				break;
			case 2:
				System.out.print("Please enter the quantity of your CHINESE COMBO: ");
				count=sc.nextInt();
				total_price+=count*chinesecombo;
				res[index]=new Restourant3("CHINESE COMBO", count, total_price);
				index++;
				total_price=0;
				break;
			case 3:
				System.out.print("Please enter the quantity of your BADA PLATTER: ");
				count=sc.nextInt();
				total_price+=count*badaplatter;
				res[index]=new Restourant3("BADA PLATTER", count, total_price);
				index++;
				total_price=0;
				break;
			case 4:
				System.out.print("Please enter the quantity of your KABAB PLATTER: ");
				count=sc.nextInt();
				total_price+=count*kababplatter;
				res[index]=new Restourant3("KABAB PLATTER", count, total_price);
				index++;
				total_price=0;
				break;
			case 5:
				System.out.print("Please enter the quantity of your STEAM MOMO(6pcs): ");
				count=sc.nextInt();
				total_price+=count*steammomo;
				res[index]=new Restourant3("STEAM MOMO(6pcs)", count, total_price);
				index++;
				total_price=0;
				break;
			case 6:
				System.out.print("Please enter the quantity of your PANFRIED MOMO(6pcs): ");
				count=sc.nextInt();
				total_price+=count*panfriedmomo;
				res[index]=new Restourant3("PAFRIED MOMO(6pcs)", count, total_price);
				index++;
				total_price=0;
				break;
		}
		System.out.println();
		System.out.print("Do you want to order(Yes/No): ");
		a=sc.next();
		if(a.equalsIgnoreCase("Yes"))
		{
			order();//call order method another time
		}
		else if(a.equalsIgnoreCase("No"))
		{
			bill();//call bill method for total bill
			System.exit(0);
		}
	}
   }
   
	//method to get total bill
	
  public void bill()
	{
		double total_amount=0;
		getallfood();
		System.out.println();
		for(int i=0;i<index;i++)
		{
			total_amount+=res[i].getFprice();
		}
		System.out.println("Total bill is: "+total_amount);
	}
  
	//method to show all food items,their quantity and price
	
  public void getallfood()
	{
		System.out.println("     ITEM\t\tQUANTITY\tPRICE");
		System.out.println("---------------------------------------------------------------");
		for(int i=0;i<index;i++) {
			System.out.println(res[i].getFname()+"\t\t"+res[i].getCount()+"\t\t"+res[i].getFprice()+"\n");
		}
	}
	
	
}


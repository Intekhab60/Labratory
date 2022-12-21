// WAP to print details of sutdents using Constructor

package oops;
class Student1
{
  int id;
  String name,address;
  long phone;
  static String institute="Anudip Foundation";
  
  
  public Student1(int id, String name, String address,long phone)
  
  {
	this.id=id;
	this.name= name;
	this.address= address;
	this.phone= phone;
  }
  
  
  public void display()
  {
	  System.out.println("ID = "+id);
	  System.out.println("Name = "+name);
	  System.out.println("Address = "+address);
	  System.out.println("Phone No = "+phone);
	  System.out.println("Institute ="+institute);
  }
  
  
   public static void changeInstituteName()
   {
     institute="Anudip Foundation for social welfare";
   }
   
}


public class ConstructDemo {
	public static void main(String[] args)
	{
		Student1 student1 = new Student1(07,"Intekhab","Kolkata",6738020109l);
		student1.display();
		System.out.println();
		
		Student1.changeInstituteName();
	
		Student1 student2 = new Student1(03,"ABD","Delhi",8893804519l);
		student2.display();
		
	}
	

}

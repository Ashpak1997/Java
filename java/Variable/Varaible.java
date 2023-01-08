 package Variable;

public class Varaible 
{
  static int a=20;  // static variable / class variable
  int b=30;         // Non-static variable / instance variable
  
  void demo()
  {
 	  int c=10;              // local variable
	  System.out.println(c);
  }
  
public static void main(String[] args) 
 {
   System.out.println(Varaible.a);    // calling static variable
   
   Varaible t = new Varaible();
   System.out.println(t.b);                // calling Non-static variable
   
   int c=10;                               // local variable
   System.out.println(c);
 }
}

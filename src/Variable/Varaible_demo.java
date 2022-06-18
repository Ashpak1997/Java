 package Variable;

public class Varaible_demo 
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
   System.out.println(Varaible_demo.a);    // calling static variable
   
   Varaible_demo t = new Varaible_demo();
   System.out.println(t.b);                // calling Non-static variable
   
   int c=10;                               // local variable
   System.out.println(c);
 }
}

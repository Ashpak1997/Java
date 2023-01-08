package This_Super;     // super - only for non-static
                                          
public class Class2 extends Class1
{
  static int a=300;
  int b=30;
  
  public void demo()
  {
	  int a = 50;
	  int b = 60;
			  
	  System.out.println(a);         // current class
	  System.out.println(b);         // current class
	  
	  System.out.println(this.a);   // Global variable of current class
	  System.out.println(this.b);   // Global variable of current class

	  System.out.println(super.a);   // previous class
	  System.out.println(super.b);   // previous class

  }
 
public static void main(String[] args) 
 {
	  // super perform only non-static variable
	
	Class2 h = new Class2();
	h.demo();
 }
}
// calling the global variable in subclass when global 
// varaible name same in superclass and sub class 
// insted of using the class name for calling 
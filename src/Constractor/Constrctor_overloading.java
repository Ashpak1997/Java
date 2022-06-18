package Constractor;

public class Constrctor_overloading 
{
 static int x;
 static char r;
 
 Constrctor_overloading()                   // Constructor 
  {
	x=10;
	r='a';
  }
 Constrctor_overloading(int a)              // Constructor 
  {
	x=20;
	r='b';
  }
 Constrctor_overloading(char b, int w)      // Constructor
 {
	 x=30;
	 r='c';
 }
 public static void main(String[] args) 
 {
   new Constrctor_overloading();         // Constructor calling
    System.out.println(x);
    System.out.println(r);
     
   new Constrctor_overloading(10);       // Constructor calling
   System.out.println(x);
   System.out.println(r);
   
   new Constrctor_overloading('d',4);    // Constructor calling
   System.out.println(x);
   System.out.println(r);
 }
}

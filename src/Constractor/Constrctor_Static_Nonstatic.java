package Constractor;

public class Constrctor_Static_Nonstatic 
{
  int a;    // static variable
  char b;   // static variable
  
  static int c;    // Non-static
  static char d;   // Non-static
  
  Constrctor_Static_Nonstatic()   // Constructor
   {
	  a=25;
	  b='m';
   }
  Constrctor_Static_Nonstatic(int t)
   {
	  c=50;
	  d='n';
   }
  
public static void main(String[] args) 
  {
	
System.out.println("-----Non-static-----");

	new Constrctor_Static_Nonstatic();  // calling constructor
	Constrctor_Static_Nonstatic t = new Constrctor_Static_Nonstatic();
	System.out.println(t.a);   
	System.out.println(t.b);
	
System.out.println("-------Static-----------");
	
// another way to call

    new Constrctor_Static_Nonstatic(0);  // calling constructor
    
	System.out.println(Constrctor_Static_Nonstatic.c);   
	System.out.println(Constrctor_Static_Nonstatic.d);
  }
}

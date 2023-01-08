package Constractor;

public class Constrctor_Nonstatic 
{
	
 int a;    // non-static    
 char b;   // non-static  
 
 Constrctor_Nonstatic()     // user define constrctor
  {
	a=10;
    b = 'g';
  }
 
public static void main (String[] args)
 {
   new Constrctor_Nonstatic();     // calling the constrctor
   Constrctor_Nonstatic t =new Constrctor_Nonstatic();
   System.out.println(t.a); 
   System.out.println(t.b);
 }
}

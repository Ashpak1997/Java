package Primative_Casting;       // Widening Casting

public class Implicit 
{
public static void main(String[] args) 
 {
   byte a = 20;       // 1 byte
   short b = a;       // 2 byte
   int c = b;         // 4 byte
   float d = c;       // 4 byte
   double e = d;      // 8 byte   
  
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  System.out.println(e);
 }  
}

// no data loss happen here
// Convert lower data into higher data
// byte => short => int => float => long => double
// can't convert long into the float
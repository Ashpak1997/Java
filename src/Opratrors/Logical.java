package Opratrors;

public class Logical 
{
public static void main(String[] args) 
{

System.out.println("------AND-------");
	
  boolean a = true;
  boolean b = false;
	
  boolean c = a&&a;
  boolean d = a&&b;
  boolean e = b&&a;
  boolean f = b&&b;
	  
  System.out.println(c);	  
  System.out.println(d);  
  System.out.println(e);  
  System.out.println(f);
  
System.out.println("------OR-------");

  boolean g = true;
  boolean h = false;
	
  boolean i = a||a;
  boolean j = a||b;
  boolean k = b||a;
  boolean l = b||b;
	  
  System.out.println(i);	  
  System.out.println(j);  
  System.out.println(k);  
  System.out.println(l);
}
}


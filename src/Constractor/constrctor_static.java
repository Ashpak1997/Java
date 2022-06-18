package Constractor;

public class constrctor_static 
 {
 static int a;
 static char b;
 
 constrctor_static()
 {
	a=10;
	b='t';
 }
public static void main(String[] args) 
 {
   new constrctor_static();	
   System.out.println(a);
   System.out.println(b);
 }
}
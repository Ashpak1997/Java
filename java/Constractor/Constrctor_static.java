package Constractor;

public class Constrctor_static 
 {
 static int a;
 static char b;
 
 Constrctor_static()
 {
	a=10;
	b='t';
 }
public static void main(String[] args) 
 {
   new Constrctor_static();	
   System.out.println(a);
   System.out.println(b);
 }
}
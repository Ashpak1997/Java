package Constractor;

public class Example1 
{
	
 int Roll_no;  // declaration of variable
 String name;  // declaration of variable
 
 Example1(int a,String b)  // constructor
   {
	 Roll_no = a;  // Initialized the variable
	 name = b;	   // Initialized the variable
   }
 
 void record()           // method 
   {
	 System.out.println("Roll number of " + name  + " is: " + Roll_no);
   }
 
 public static void main(String[] args) 
 {
	 Example1 t = new Example1(77,"Ashpak");
	 t.record();
	 
	 Example1 h = new Example1(45,"Dhananjay");
	 h.record();
 } 
}

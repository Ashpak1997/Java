package UpCasting;

public class SuperClass 
{
public static void main(String[] args) 
 {
	Class_1 a = new Class_1();
	a.Ashpak();                 // Non-static Method
	a.Shaikh();                 // Static Method
	
	Class_2 b = new Class_2();
	b.Ashpak();                 // Non-static Method
	b.Shaikh();;                // Static Method
	
System.out.println("----------------------------------------------------");

// Aquaring methods subclass into superclass

   Class_1 c = new Class_2();  // Up_casting
   c.Ashpak();                 // Non-static Method
   c.Shaikh();                 // Static Method
   
 }
}




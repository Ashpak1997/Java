package Constractor;

public class Example2 
{
	long salary;  // Declaration of variable
	String Name;  // Declaration of variable
	
	Example2( long x, String y)  // Constructor
	 {
		salary = x;
		Name = y;
	 }
	
	void data()  // used method for multiple output
	{
		System.out.println("salary of "+Name+" is: "+salary);
	}
	
public static void main(String[] args)  // main method 
  {
	Example2 t = new Example2(12000, "Ashpak");  // calling used method
	t.data();
	
	Example2 h = new Example2(15000,"Yuraj");    // calling used method
	h.data();
	
	Example2 f = new Example2(50000, "Vaibhav"); // calling used method
	f.data();	
 }
}

package Interface;         // implements class

public class Implement_class implements Interface 
{
 public void Ashpak()  // here we need to write public because its not a interface
   {
	 System.out.println("Ashpak() form Implement_class"); 
   }
 
 public void Shaikh()  // here we need to write public because its not a interface
  {
	 System.out.println("Shaikh() form Implement_class");  
  }

 public static void main(String[] args) 
 {
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	// create object for non-static method
	 
	 Implement_class ref = new Implement_class(); 
	 ref.Ashpak();
	 ref.Shaikh();
	 
	 System.out.println(a);                    // calling variable 
	 System.out.println(Interface.a);          // calling variable with class
	 System.out.println(Implement_class.a);    // calling variable with class
 }
}

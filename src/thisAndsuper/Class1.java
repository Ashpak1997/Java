package thisAndsuper;    // this - static &  non-static 

public class Class1 
{
   static int a=200;   // class variable
   int b=100;          // instance variable
   
   public void ashpak()
   {
	   int a=20;
	   int b=10;
	   
	   System.out.println(Class1.a);   // calling global variable
	   
	   System.out.println(a);          // call local
	   
	   System.out.println(this.a);     //  calling Global variable
	   
	   System.out.println(b);          // call  local
	   
	   System.out.println(this.b);     // call Global
   }
   
public static void main(String[] args) 
   {
    	Class1 t = new Class1();
	   t.ashpak();
   }
}
// In user define method if we calling the varaible 
// then only call the local variable 
// but in method user define method we call call the variable with 
// this keyword then global vaiable also called
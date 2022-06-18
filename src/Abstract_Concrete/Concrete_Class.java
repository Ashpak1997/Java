package Abstract_Concrete;

public class Concrete_Class extends Abstarct_Class 
{
public void method2()   //  provide body
  {
	 System.out.println("from concrete class");
  }
public static void main(String[] args) 
  {
	
    // create object of Concrete Class	
	
	Concrete_Class t = new Concrete_Class();
		t.method1();
	    t.method2();
  }
}

package Super_Keywords;

/* During over-riding the method superclass is disappearing so avoiding this 
 * we are using this - Super keywords
 */

public class Class_MethodB extends Class_MethodA {

	public void Method1() 
	{
		System.out.println("Method-a frome Subclass");
	}
	
	public void Method2() 
	{
		System.out.println("Method-B frome Subclass");	
	}
	
	public void printMeassage() {
		
		Method1();  // Same class
		Method2();  // Same class
		
		super.Method1();          // Calling superclass method
		super.Method2();
	}
	
	public static void main(String[] args) {
		
		Class_MethodB ref = new Class_MethodB();
		ref.printMeassage();
		
	}
}

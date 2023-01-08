package Super_Keywords;

/*   At time using this & super keywords its call/write any non static method
 *   then this method call in main method 
 */

public class ClassB_Variable extends ClassA_Variable{
	
	int a = 700;
	int b = 800;
	
	public void method1() {
		
		int a = 70;
		int b = 80;
		
		System.out.println(a);         // Local Variable
		System.out.println(b);         // Local Variable
		
		System.out.println(this.a);    // Global Variable
		System.out.println(this.b);    // Global Variable
		
		System.out.println(super.a);   // Superclass Global Variable
		System.out.println(super.b);   // Superclass Global Variable
	}
	
	public static void main(String[] args) {
		
		ClassB_Variable ref = new ClassB_Variable();
		ref.method1();
		
	}
	
}


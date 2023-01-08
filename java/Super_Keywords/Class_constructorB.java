package Super_Keywords;

/*   At time using this & super keywords its call/write any non static method
 *   then this method call in main method 
 */

public class Class_constructorB extends Class_constructorA {

	Class_constructorB(){

		super();    // Constructor calling from superclass

		System.out.println("From Subclass");
	}

	public static void main(String[] args) {
		
		new Class_constructorB();
	}

}

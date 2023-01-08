package Super_Keywords;

/*   At time using this & super keywords its call/write any non static method
 *   then this method call in main method 
 */

public class ClassA_Variable {

	int a = 10;
	int b = 20;

	public void Ashpak() {   // instance method 

		int a = 100;
		int b = 200;

		System.out.println(a);
		System.out.println(b);	
		
		System.out.println(this.a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		
		ClassA_Variable ref = new ClassA_Variable();
		ref.Ashpak();
		
	}	

}

package Polymorphism;

public class Method_Overriding2 {
	
	public static void ashpak() {
		System.out.println("From Subclass");
	}
	
	public static void shaikh() {
		System.out.println("From Subclass");
	}
	

	public static void main(String[] args) {
		
		Method_Overriding1.ashpak();  // Calling method from other class
		Method_Overriding1.shaikh();
		
		ashpak();     // calling method from same class3
		
		shaikh();
		
	}
}

package Polymorphism;


public class Method_Overloading1 {

	public static void Ashpak() {
		System.out.println("Method 1");
	}

	public static void Ashpak(int number) {
		System.out.println("Method 2");

	}

	public static void Ashpak(char allpahbet) {
		System.out.println("Method 3");

	}

	public static void Ashpak(String name) {
		System.out.println("Method 4");
	}

	public static void main(String[] args) {
		
		Method_Overloading1.Ashpak();
		Method_Overloading1.Ashpak(2);
		Method_Overloading1.Ashpak('s');
		Method_Overloading1.Ashpak("sdsd");

	}
	
}

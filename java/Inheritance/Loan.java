package Inheritance;

public class Loan {

	static int Amount = 10;
	static float Balance = 23;
	static String Area = "Ashpak12";
	
	double calculateEMI(double principal) {
		
		double simpleInterest = (principal*8.5*5)/100;
		double emi = (simpleInterest+principal)/5;
		return emi;	
	}
	
	public static void MethodSuper() {
		
		System.out.println("From Superclass");	
	}
	
	public static void main(String[] args) {
		
	}
}


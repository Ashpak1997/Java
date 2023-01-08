package Inheritance;

public class Demo {

	static int Amount = 5;
	static float pricipal = 20000;
	static float interestRate = 8.5f;
	static String Area = "Ashpak12";

	public double calcualteEMI() {
		double simpleInterest = (pricipal*interestRate*Amount)/100;
		return (simpleInterest+pricipal)/Amount;
	}
}

class HomeLoan1 extends Demo{

	HomeLoan1(){

		// reusing superclass member variable

		Amount=5;  
		float pricipal = 20000;
		float interestRate = 8.5f;
		String Area = "Ashpak12";
	}

	public static void main(String[] args) {

		HomeLoan hloan = new HomeLoan();
		double amount = hloan.calcualteEMI();

		System.out.println("EMI per year : " + amount);

	}
}
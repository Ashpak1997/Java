package Inheritance;

public class Plotloan {

	public static void main(String[] args) {

		System.out.println("Request for Plotloan");

		Loan.MethodSuper();   // Method Calling from Superclass

		System.out.println(Loan.Amount); // Variable  Calling from Superclass

		System.out.println(Loan.Balance); // Variable Calling from Superclass

		System.out.println(Loan.Area); // Variable Calling from Superclass

	}

}

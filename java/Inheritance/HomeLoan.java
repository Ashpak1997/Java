package Inheritance;

public class HomeLoan extends Loan {

	double calculateEMI(double principal) {

		double emi = super.calculateEMI(principal);
		int additionlTax = 300;
		return emi;
	}
	
	
	public static void main(String[] args) {

		System.out.println("Request for Homeloan");

		Loan.MethodSuper();   // Method Calling from Superclass

		System.out.println(Loan.Amount); // Variable  Calling from Superclass

		System.out.println(Loan.Balance); // Variable Calling from Superclass

		System.out.println(Loan.Area); // Variable Calling from Superclass
	}

}


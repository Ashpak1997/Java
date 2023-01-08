package Polymorphism;

public class Method_Overloading2 {    // Compile time

	private int Amount;       // Variable initialize
	private int pricipal;
	private float interest;


	Method_Overloading2() {   // Constructor

		Amount = 5;
		pricipal = 20000;
		interest = 8.5f;
	}

	public double calculateEMI(int a, double d)  // Method 1 
	{
		double simpleInterest = (Amount*pricipal*interest)/100;
		return (simpleInterest+pricipal)/Amount;
	}

	public double calculateEMI(double d, int a) // Method 2
	{
		double simpleInterest = (Amount*interest)/100;
		return (simpleInterest+pricipal)/Amount;
	}

	public static void main(String[] args) {
	
		Method_Overloading2 ref = new Method_Overloading2();  // Object 

		double result = ref.calculateEMI(2, 5d);    // calling method
		double value = ref.calculateEMI(5d, 6);     // calling method
		
		System.out.println("EMI per year is : " + result );
		System.out.println("EMI per year is : " + value);
	}
}

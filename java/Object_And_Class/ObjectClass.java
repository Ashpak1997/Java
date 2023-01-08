package Object_And_Class;

public class ObjectClass{

	private double balance = 500.00;                         //Variable

	public double getBalance(int accountId){                 //Method with return type

		return balance;
	}
	
	public static void main(String[] args) {                // main method

		ObjectClass accnt =  new ObjectClass();             // object creation
		double value = accnt.getBalance(123456);

		System.out.println("The balance is:" + value);
	}
}







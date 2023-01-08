package Enhanced_For_Loop;

//Used to iterate thought elements of arrays and collections (like Arraylist)

public class Enhanced_For_loop {

	public static void main(String[] args) {
		
		double balance = 600;
		double rateOfInterest = 0.10;
		double interest = 0;
		double withdrawl = 500;
		double deposit = 600;
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i : arr) {
			
			balance += deposit;
			balance -= withdrawl;
			interest = balance * rateOfInterest;
	        balance += interest;
			System.out.println("The interest for the month" +i+ " is "+ interest);
		}
		
		
	}
}

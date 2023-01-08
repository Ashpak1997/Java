package Pratice;

public class Customer extends Employee {

	int salary;
	Customer(int salary){
		
		this.salary = salary;
		name = "maddy";
		
	}
	
	public void getDetails() {

		System.out.println(name+age+salary);
	}
	
}

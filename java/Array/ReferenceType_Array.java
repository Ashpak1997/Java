package Array;

public class ReferenceType_Array {

	public static void main(String[] args) {

		Costomer [] costomer = new Costomer[2];  // Reference type array
		Costomer costomer1 = new Costomer1("Ashpak","Ashpak123");
		Costomer costomer2 = new Costomer("Shaikh","Shaikh321");
		
		costomer[0] = costomer1;
		costomer[1] = costomer2;
		
		for(int i=0; i<costomer.length; i++) {
			
			Costomer customObject = customer[i];
			String name = customeObject.displayCutomerName();
			System.out.println("The customer name is : " + name);
		}	
	}
}


class Customer {
	
	private String name ;
	private String costomerId;
	
	Customer (String uname, String ucustomerId){
		name = uname;
		custmerId = ucustomerId;
	}
	
	public string displayCustomerNAme() {
		return name;
	}
}
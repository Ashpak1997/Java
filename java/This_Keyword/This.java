package This_Keyword;

//Its used to access the instance variable of class

public class This {

	private String bankName;   // Instance Variable
	private String area;
	private String phoneNumber;

	This(String bname, String barea, String phoneNo) {
		
// this keyword is used to assign the value for instance varaible
		
		this.bankName = bname;
		this.area = barea;
		this.phoneNumber = phoneNo;
	}

	void displayBankDetails() 
	{
		System.out.println("Bank name :" + bankName);	
		System.out.println("Area of Bank :" + area);
		System.out.println("Phone no of bank :" + phoneNumber);
	}

	public static void main(String[] args) {
		
// Calling the parameterized constructor
		
		This bank2 = new This("Cental","Samsherpur","12122121212");
		bank2.displayBankDetails();
	}
}

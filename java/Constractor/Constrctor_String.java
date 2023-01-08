package Constractor;

public class Constrctor_String {

	private String bankName;
	private String area;
	private String phoneNumber;

	Constrctor_String()    //Without Parameter constructor
	{
		bankName = "SBI";
		area = "Bhosari";
		phoneNumber = "1234567890";
	}

	Constrctor_String(String bname, String barea, String phoneNo)  // Parameter constructor
	{
		bankName = bname;
		area = barea;
		phoneNumber = phoneNo;
	}

	void displayBankDetails() 
	{
		System.out.println("Bank name :" + bankName);	
		System.out.println("Area of Bank :" + area);
		System.out.println("Phone no of bank :" + phoneNumber);
	}

	public static void main(String[] args) 
	{
		//call Without Parameter constructor
		new Constrctor_String();
		Constrctor_String bank1 = new Constrctor_String(); //call Without Parameter constructor
		System.out.println(bank1.bankName);
		System.out.println(bank1.area);
		System.out.println(bank1.phoneNumber);
		
		System.out.println("=====================================");

		//call Without Parameter constructor
		Constrctor_String bank2 = new Constrctor_String("Cental","Samsherpur","12122121212");
		bank2.displayBankDetails();
	}
}

package Super_Keywords;

public class Loan 
{
  Loan(){
	  System.out.println("Request for loan");
  }
}

class HomeLoan extends Loan {
	
	public static void main(String[] args) 
	{
		HomeLoan ref = new HomeLoan();
	}
}
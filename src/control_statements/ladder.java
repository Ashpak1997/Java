package control_statements;

public class ladder 
{	
public static void main(String[] args) 
 {
	int n1 = 40;
	int n2 = 100;
	int n3 = 30;
	
  if (n1>n2)     // true
  	 {
  		if (n1>n3)
  		 {
  			System.out.println("n1 is greater");
  		 } 
  		else
  		 {
  			System.out.println("n3 is gretaer");
  		 }
  	  }
  else          // false
  	  {
  		if (n2>n3)
  		 {
  			System.out.println("n2 is greater");
  		 }
  		else
  		 {
  		   System.out.println("n3 is greater");	
  		}
 }
}
}

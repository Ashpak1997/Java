package Star_pattern;

public class left_half_diamond 
{
	public static void main(String[] args) 
	{	                   //upper side
	  for(int i=1; i<=10; i++)  
	  {
		  for(int k=9; k>=i; k--)       // spaces
		  {
			  System.out.print(" ");
		  }
		  for(int j=1; j<=i; j++)       // rows
		  {
			 System.out.print("*");     // column
		  }
		System.out.println();  
	  }                   //lower part
	  for(int a=1; a<=10; a++)          //rows       
	   { 
		  for(int p=1; p<=a; p++)       // spaces
		  {
			  System.out.print(" ");
		  }
		  for(int b=9; b>=a; b--)       //rows
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	 }
}

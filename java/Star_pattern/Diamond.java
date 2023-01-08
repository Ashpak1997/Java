package Star_pattern;

public class Diamond 
{
 public static void main(String[] args) 
   {                                 // upper part
	for(int i=1; i<=10; i++)         // rows
	  {
		for(int k=9; k>=i; k--)      //spaces
		{
		  System.out.print(" ");	
		}
		for(int j=1; j<=i; j++)      //column
		{
			System.out.print(" *");
		}
	 System.out.println();
	}                               // lower part
  for(int a=1; a<=10; a++)          // rows
   {
	  for(int b=1; b<=a; b++)
	  {
		 System.out.print(" ");     //spaces
	  }
	  for(int c=9; c>=a; c--)
	  {
		 System.out.print(" *");    //column
	  }
	System.out.println();  
   }
  }
}

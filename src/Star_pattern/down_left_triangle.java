package Star_pattern;

public class down_left_triangle 
{
	public static void main(String[] args) 
	  {
		for(int i=1; i<=5; i++)         // rows
		 { 
		   for(int k=1; k<i; k++)      // spaces
		      {
			   System.out.print(" ");
		      }
	       for(int j=5; j>=i; j--)     //column
	          {
		       System.out.print("*");
	          }
	     System.out.println();
	   }
}
}


package Star_pattern;

public class left_triangle 
{
public static void main(String[] args) 
  {
	for(int i=1; i<=5; i++)         // rows
	 { 
	   for(int k=4; k>=i; k--)      // spaces
	      {
		   System.out.print(" ");
	      }
        for(int j=1; j<=i; j++)     //column
          {
	       System.out.print("*");
          }
     System.out.println();
   }
 } 
}
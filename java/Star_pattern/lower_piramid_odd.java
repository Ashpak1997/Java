package Star_pattern;

public class lower_piramid_odd
{
  public static void main(String[] args) 
  {
	for(int i=1; i<=10; i++)     //rows
	   {
		 for(int k=1; k<i; k++)
			{
			   System.out.print(" ");   // spaces
			}
		 for(int j=10; j>=(2*i-6); j--)
		   {
			   System.out.print("*");   // coloum
		   }
	 System.out.println();
	}
  }
}

package Star_pattern;

public class piramid_odd 
{
public static void main(String[] args)
 {			
	 for(int i=1; i<=10; i++)     //rows
	 {
	   for(int k=10; k>i; k--)
	    {
		  System.out.print(" ");   // spaces
	    }
	  for(int j=1; j<=(2*i-1); j++)
	    {
		  System.out.print("*");   // coloum
	    }
	System.out.println();
  }
 }
}


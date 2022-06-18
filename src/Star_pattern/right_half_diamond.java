package Star_pattern;

public class right_half_diamond 
{
public static void main(String[] args) 
{	                         //upper side
  for(int i=1; i<=10; i++)  
  {
	  for(int j=1; j<=i; j++)       // rows
	  {
		 System.out.print("*");     // column
	  }
	System.out.println();  
  }                                 //lower rpart
  for(int a=1; a<=9; a++)          //rows       
   { 
	  for(int b=9; b>=a; b--)      //rows
	  {
		  System.out.print("*");
	  }
	  System.out.println();
  }
 }
}

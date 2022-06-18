package Star_pattern;

public class by_if_else 
{
public static void main(String[] args) 
{
 for(int a=1; a<=10; a++)
 {
	 for(int b=1; b<=a; b++)
	 {
		 if(b>a)
		   {
			 System.out.print(" ");
		   }
		 else
		  {
			System.out.print("*"); 
		  } 
	 }
	 System.out.println();
   }
 }
}

package loops;

public class All_loops 
{
  public static void main(String[] args) 
  {
System.out.println("normal printing");
	
    System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);

System.out.println("for loop");             
   
    for(int i=0; i<=6; i++)               // for loop
     {
       System.out.println(i);	
     }
 
System.out.println("while loop");

  int a=0; 
  while(a<=6)                             // while loop
  {
	  System.out.println(a);
	  a++;
  }
System.out.println("do-while loop");

  int b=0;
  do                                     // do while loops
  {
	  System.out.println(b);
	  b++;
  }
  while(b<=6);
  }
}

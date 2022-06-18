package String;

public class Methods_string 
{ 
 public static void main(String[] args) 
 {
	String a = "India";
	String b = "india";
    String c = "My village name is samsherpur";
    String d = "     Ashpak";
    String e = "Shaikh     ";
    
System.out.println("-------------------------------------------------------------------"); 
//length of string
     System.out.println(a.length());    
     System.out.println(b.length());     
     System.out.println(c.length());
    
System.out.println("-------------------------------------------------------------------");
// char on index - return char
     System.out.println(a.charAt(2));
     System.out.println(c.charAt(11));
     
System.out.println("-------------------------------------------------------------------");
// index of char - return index
     System.out.println(a.indexOf("i"));
     System.out.println(c.indexOf("g"));
 
System.out.println("-------------------------------------------------------------------");
 // concatenation(combine two string)
     System.out.println(a+" is my contry");
 
System.out.println("--------------------------------------------------------------------");
//uppercase

     System.out.println(a.toUpperCase());
     System.out.println(c.toUpperCase());

System.out.println("--------------------------------------------------------------------");
//lowercase
  
      System.out.println(a.toLowerCase());
      System.out.println(c.toLowerCase());
 
System.out.println("-------------------------------------------------------------------");
//equal Igone - check both are same or not avoided case
 
      System.out.println(a.equalsIgnoreCase(b));
      System.out.println(a.equalsIgnoreCase(c));

System.out.println("-------------------------------------------------------------------");
// avoided the spaces - forward or backward 

      System.out.println(d.trim()); 
      System.out.println(e.trim());
      
System.out.println("-------------------------------------------------------------------");
// split - convert sentense word as a index 
 
     String [] x = c.split("name");
     
     System.out.println(x[0]);     // before name is index as 0
     System.out.println(x[1]);     // before name is index as 1
     
     String [] y = c.split("village");
     
     System.out.println(y[0]); 
     System.out.println(y[1]); 
 }		 
}


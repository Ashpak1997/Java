package String;

public class Area_string 
{
public static void main(String[] args) 
{
	String a = "Ashpak";        // constant pool area
	String b = "Ashpak";        // constant pool area
    String c = "asHpaK";        // constant pool area
    
    String t = new String ("Ashpak");     // Non-constant pool area
    String h = new String ("Ashpak");     // Non-constant pool area

System.out.println("---------------------------------------------------------------");
 
    System.out.println(a==b);    // address
    System.out.println(a==c);    // address   
    System.out.println(a==t);    // address
    System.out.println(t==h);    // address
    
System.out.println("---------------------------------------------------------------");

    System.out.println(a.equals(b));    // value
    System.out.println(a.equals(c));    // value
    System.out.println(a.equals(t));    // value
    System.out.println(t.equals(h));    // value
 }
}
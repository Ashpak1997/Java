package Primative_Casting;     // Narrowing Casting

public class Explicit 
{
public static void main(String[] args) 
 {
	double a = 10.23d;  // 8 byte 
	int b = (int)a;     // 4 byte
	
	System.out.println(a);
	System.out.println(b);
	
	short s = 129;     // 2 byte
	byte c = (byte)s;  // 1 byte (-128,-127, ..........0,1,2,3,127)
	
	System.out.println(s);
    System.out.println(c);	
 }
}

// -128,-127............0,1,2,3,127, 128, 129, 130,......256, 257
//                                   -128,-127,-126.......0, 1, 


// Converting lower data type into higher data type
// Double –> long –> float –> int –> short –> byte 
// can't convert double into long
// can't convert double into float 
// can't convert double into int
// can't convert double into short
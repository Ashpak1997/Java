package Variable;

public class Keywords_ans_Identifiers {
	
	int i = 34;       // Instance variable 
	static int z;     // Static variable
	
	static {
		
		z=10;
		System.out.println("Inside static block : " + z);
	}
	
	void test() {
		
		int k=200;
		System.out.println("Local variable : " + (z+1));
	}
	
	public static void main(String[] args) {
		
		Keywords_ans_Identifiers ref = new Keywords_ans_Identifiers();
		ref.test();                         // non-static method access
		System.out.println(ref.i);          // non--static variable access
	}

}

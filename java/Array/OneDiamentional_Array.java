package Array;

public class OneDiamentional_Array {

	public static void main(String[] args) {

		int[] phone = new int[3];
		phone[0] = 123;
		phone[1] = 456;
		phone[2] = 789;

		int Count = 1;

		for(int i=0; i<=phone.length; i++) {
			System.out.println("Phone number " + Count + " : " +phone[i]);
			++Count;			
		}
	}
}

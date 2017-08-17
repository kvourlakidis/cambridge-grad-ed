// Question: []

public class Question02 {
	public static void main(String[] args) {
		byte x = 5;
		byte y = 10;
		int     z1 = x + y; // okay
		long    z2 = x + y; // int fits into a long
// 		boolean z3 = x + y; // incompatible types
		double  z4 = x + y; // okay? 
		short   z5 = (short) (x + y); // explicit demote to an short 
		byte    z6 = (byte)  (x + y); // explicit demote to a byte
	}
}

// Answers: []

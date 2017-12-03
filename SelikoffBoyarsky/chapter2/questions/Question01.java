// Question: which commented out lines will compile?

public class Question01 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println(a == b);
		// System.out.println(a + b); // illegal operation
		// a--; // illegal operation
		System.out.println(!a);
		// System.out.println(a % b); // illegal operation
		// System.out.println(a <= b); // illegal operation
	}
}

// Answers: []

// What is the output?

public class Question11 {
	double d;
	int i;
	String s;


	public static void main(String[] args) {
		Question11 q = new Question11();
		// System.out.println(q.d == null); // primitive cannot be null
		// System.out.println(q.i == null); // primitive cannot be null
		System.out.println(q.s == null); // true
		System.out.println(q.d == 0.0);  // true
		System.out.println(q.i == 0.0);  // true
		// System.out.println(q.s == 0.0);  // incomparable types: String and double
	}

}


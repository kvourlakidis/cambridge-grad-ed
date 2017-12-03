// What is the output?

public class Question13 {

	boolean b;
	int i;

	public static void main(String[] args) {
		Question13 q = new Question13();
		System.out.println(q.b == false); // true
		System.out.println(q.b == true); // false
		// System.out.println(q.b == null); // primitive cannot be null
		System.out.println(q.i == 0); // true
		System.out.println(q.i == 0.0); // true
		// System.out.println(q.i == null); // primitive cannot be null
	}
}
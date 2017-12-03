// Which of the following lines compile?

public class Question15 {
	public static void main(String[] args) {
		int    i1 = 1_234; // legal
		// double d1 = 1_1234_.0; // illegal underscore
		// double d2 = 1_234._0; // illegal underscore
		// double d3 = 1_123.0_; // illegal underscore
		double d4 = 1_234.0; // YES
	}
}

// [ANSWERS]

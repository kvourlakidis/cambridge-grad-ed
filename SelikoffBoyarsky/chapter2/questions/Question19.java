// Question: what is the output of this program?

public class Question19 {
	public static void main(String[] args) {
		int m = 9, n = 1, x = 0;
		while (m > n) {
			m--;
			n += 2;
			x += m + n;
		}
	System.out.println(x);
	}
}

// Hint: see the hint for question 18.
// Question: what is the output of this program?

public class Question08 {
	public static void main(String[] args) {
		boolean x = true, z = false;
		int y = 20;
		x = (y != 10) && (z = true);
		System.out.println(x + ", " + y + ", " + z);
	}
}

// Answers: []

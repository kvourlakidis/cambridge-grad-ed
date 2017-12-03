// Question: []

public class Question06 {
	public static void main(String[] args) {
		int x = 4;
		long y = x * 4 - x++; // y = 4 * 4 - 4; x = 4 + 1;
		if (y < 10) 
			System.out.println("Too Low");
		else if (y==10) 
			System.out.println("Just right");
		else 
			System.out.println("Too high");
		System.out.println(y);
	}
}

// Answers: []

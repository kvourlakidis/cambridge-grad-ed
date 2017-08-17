// Question: []

public class Question06 {
	public static void main(String[] args) {
		int x = 4;
		long y = x * 4 - x++;
		if (y < 10) 
			System.out.println("Too Low");
		else if (y==10) 
			System.out.println("Just right");
		else 
			System.out.println("Too high");
	}
}

// Answers: []

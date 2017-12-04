// Question: what is the output of this program?

public class Question14 {
	public static void main(String[] args) {
		int c = 7;
		int result = 4;
		result += ++c;
        result = result++;
		System.out.println(result);
	}
}

// Hint: just be happy this isn't C++. Ba-dum.
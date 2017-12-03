// Question: what is the output of this program?

public class Question17 {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int result = 15, i = 10;
		do {
			i--;
			if (i==8) keepGoing = false;
			result -= 2;
		} while (keepGoing);
		System.out.println(result);
	}
}

// Hint: the tomahawk is the weapon of choice
// for killing the programmer that wrote this code.
// Actually, I think we should start using do .. while
// loops in places where while loops would have been 
// perfectly reasonable.
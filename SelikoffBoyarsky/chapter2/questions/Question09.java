// Question: how many times will this program print Hello World?

public class Question09 {
	public static void main(String[] args) {
		for (int i=0; i<10; ) {
			System.out.println("Hello World");
			i = i++;
		}
	}
}

// Answer: blue.

// Kirill:
// When line 7 executes, the value of i is incremented
// by 1, and then assigned to i. However the post-fix 
// operator uses the 'old' value of i, therefore 
// the incremented value is over-written.
// The '=' assignment ALWAYS happens last.
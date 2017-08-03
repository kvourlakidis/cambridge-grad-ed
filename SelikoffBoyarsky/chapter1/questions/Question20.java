public class Question20 {
	protected void finalize() {
		System.out.println("Roar!");
	}

	public static void main(String[] args) {
		Question20 q = new Question20();
		q = null;
		System.gc();
	}
}

/*

Which of the following are true?

finalize() is guaranteed to be called.
finalize() might or might not be called
finalize() is guaranteed not to be called.
Garbage collection is guaranteed to run.
Garbage collection might or might not run.
Garbage collection is guaranteed not to run.
The code does not compile.

*/

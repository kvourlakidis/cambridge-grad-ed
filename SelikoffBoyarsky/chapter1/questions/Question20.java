public class Question20 {

    int a;

    public Question20(int a) {
        this.a = a;
    }

    public Question20() {
    }

	protected void finalize() {
        System.out.println("Roar1\n");
		System.out.println("Roar2\n");
        System.out.println("Roar3\n");
	}

	public static void main(String[] args) {
        Question20 q;
		for (int i=0;i<10;i++) {
            q = new Question20();
            // System.gc();
        }
		q = null;
		System.gc();
	}
}

/*

Which of the following are true?

finalize() is guaranteed to be called.
finalize() might or might not be called.
finalize() is guaranteed not to be called.
Garbage collection is guaranteed to run.
Garbage collection might or might not run.
Garbage collection is guaranteed not to run.
The code does not compile.

*/

// Kirill: the output of running this is weird.
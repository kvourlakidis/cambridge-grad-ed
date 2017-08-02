// Try to predict the console output
// from running the main method in this class.

public class InitOrder {

	public static void main(String[] args) {
		System.out.println("1. First sysout in main.");

		System.out.println("2. s is: " + s);

		myStaticMethod();

		System.out.println("4. s is: " + s);
	
		InitOrder initOrder1 = new InitOrder();
	
		System.out.println("8. s is: " + s);

		initOrder1 = null; // de-reference the object

		System.gc(); // run the garbage collector (maybe?)

		System.out.println("9. Last sysout in main.");
	}

	// constructor
	public InitOrder() {
		System.out.println("7. Inside constructor s is: " + s);
		s = "now the constructor is King!";
	}

	// first init block
	{
		System.out.println("5. Inside init block 1.");
		s = "now the static block is King!";
	}

	// static method
	static void myStaticMethod(){
		System.out.println("3. Inside myStaticMethod.");
		s = "now the static method is King!";	
	}

	// second init block
	{
		System.out.println("6. Inside init block 2.");
	}

	// finalize runs when the object is discarded by the GC
	public void finalize() {
		System.out.println("Are you felling lucky, punk?");
	}

	// static blocks are freaking awesome
	static {
		System.out.println("0. I am a STATIC block, bitches!");
		// Can I reference "s" in here? Try it to find out...
		// System.out.println(s);

		// What about this one?
		// s = "Static block is King!";
	}

	static String s;
}

public class Question01 {
	public static void main(String[] args) {
		// which of the following are legal?
		// compile to find out :)
		Object A$B;          // fine 
		Object _helloWorld;  // fine
		Object true;         // true is a reserved word
		Object java.lang;    // cant have dots
		Object Public;       // fine but evil (public is reserved, Public isn't)
		Object 1908_s;	     // identifiers can't start with a number	
	}
}

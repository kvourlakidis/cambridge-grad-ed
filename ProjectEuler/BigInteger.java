// TODO class under construction, may not compile
public class BigInteger {
	static int INITIAL_LENGTH = 10;
	char[] container;
	boolean isNegative;
	static char NEGATION_CHAR = '-';
	static char SPACE 
	static char[] LEGAL_CHARS = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']; static char INIT_CHAR = '0';
	
	
	private static isLegalChar(char test) {
		for (char legal in LEGAL_CHARS)
			if (test == legal) 
				return true;	
		return false;	
	}

	private static parseChar(char in) throws Exception {
		if (isLegalChar(in))
			return in;
		throw new Exception("cannot parse " + in);	
	}
	
	public BigInteger() {
		container = new char[INITIAL_LENGTH];	
		isNegative = false;
	}


	public BigInteger(int size){
		container = new char[size];
		isNegative = false;	
	}

	public BigInteger(String s){
		if (s.charAt(0) == NEGATION_CHAR) {
			container = new char[s.length() - 1];
			isNegative = true;	
			for (int i=1; i < s.length(); i++) {
				container[i - 1] = parseChar(s.charAt(i));
			}
			return this;
		}
		container = new char[s.length()];
		isNegative = false;
		for (int i=0; i < s.length(); i++) {
			container[i] = parseChar(s.charAt(i));	
		}
	}
	public static void main(String[] args) {
		BigInteger x = new BigInteger();	
		System.out.println(x.container);

	}
}

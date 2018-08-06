// TODO class under construction, may not compile
public class BigInteger {
	static int INITIAL_LENGTH = 10;
	char[] container;
	boolean isNegative;
	static char NEGATION_CHAR = '-';
	static char SPACE = ' ';
	static char[] LEGAL_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; 
	static char INIT_CHAR = '0';
	
	private static boolean isLegalChar(char test) {
		for (char legal : LEGAL_CHARS)
			if (test == legal) 
				return true;	
		return false;	
	}

	private static char parseChar(char in) {
		if (isLegalChar(in))
			return in;
		throw new RuntimeException("cannot parse " + in);	
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
		} else {
			container = new char[s.length()];
			isNegative = false;
			for (int i=0; i < s.length(); i++) {
				container[i] = parseChar(s.charAt(i));	
			}
		}
	}

	public void add(BigInteger other) {
		
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (isNegative) sb.append(NEGATION_CHAR);
		for (char c : container) sb.append(c);
		return sb.toString(); 
	}

	public static void main(String[] args) {
		BigInteger x1 = new BigInteger();
		BigInteger x2 = new BigInteger("1234567890");
		BigInteger x3 = new BigInteger("-1234567789");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
}

public class Question02 {
	public static void main(String[] args) {
		String s = "Hello";       // uses the string pool
		String t = new String(s); // tells JVM to not use the string pool
		if ("Hello".equals(s)) System.out.println("one"); // true
        if (t == s) System.out.println("two"); // false (different objects)
        if (t.equals(s)) System.out.println("three"); // true
        if ("Hello" == s) System.out.println("four"); // true (same object in string pool)
        if ("Hello" == t) System.out.println("five"); // false (different objects)
	}
}

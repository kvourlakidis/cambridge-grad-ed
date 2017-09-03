public class Question02 {
	public static void main(String[] args) {
		String s = "hello";
		String t = new String(s); // tells JVM to not use the string pool
		System.out.println(s.equals(t));
		System.out.println(s == t);
		System.out.println("hello" == s);
		System.out.println("hello" == t);
	}
}

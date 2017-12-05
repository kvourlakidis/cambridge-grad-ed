// Question: what is the result of the following code?

public class Question05 {
    public static void main(String[] args) {
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        if (s1 == s2) // this line does not compile (incomparable types)
            System.out.print("1");
        if (s1.equals(s2)) // false
            System.out.print("2");
    }
}

// Hint: 
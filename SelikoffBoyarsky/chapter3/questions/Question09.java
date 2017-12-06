// Question: what is the result of this code?

public class Question09 {
    public static void main(String[] args) {
        //          0123 (length: 4)
        String s = "purr";
        s.toUpperCase(); // no side-effects
        s.trim();        // no side-effects
        s.substring(1,3);// no side-effects
        //    0123 (length: 4)
        s += " two"; // s = s + " two";
        System.out.println(s.length()); // 8
    }
}

// Hint: 
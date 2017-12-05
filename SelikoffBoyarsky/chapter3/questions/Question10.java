// Question: what is the result of this code?

public class Question10 {
    public static void main(String[] args) {
        String a = ""; // set a to an empty string
        a += 2;        // a = a + 2;
        a += 'c';      // a = a + 'c';
        a += false;    // a = a + false;
        if (a == "2cfalse")      System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
    }
}

// Hint: manipulating a string at runtime gives
// you a string which is not in the string pool.
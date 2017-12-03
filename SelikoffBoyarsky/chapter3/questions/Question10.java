// Question: 

public class Question10 {
    public static void main(String[] args) {
        String a = ""; // set a to an empty string
        a += 2;        // append an int primitive
        a += 'c';      // append a char primitive
        a += false;    // append boolean primitive
        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
    }
}

// Hint: 
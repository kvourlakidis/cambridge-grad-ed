// Question: which commented out lines are legal?

public class Question16 {
    public static void main(String[] args) {
        char[] c = new char[2];
        // int length = c.capacity; // illegal
        // int length = c.capacity(); // illegal
        // int length = c.length; // legal
        // int length = c.length(); // illegal
        int length = c.size; // illegal
        // int length = c.size(); // illegal
    }
}

// Hint: 
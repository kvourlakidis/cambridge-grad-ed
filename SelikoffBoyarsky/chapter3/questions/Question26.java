import java.util.*;

// Question: Which of the following are true?
// The code compiles. - true
// The code throws a runtime exception. - true
// Exactly one of the add statements uses autoboxing.
// Exactly two of the add statements use autoboxing.
// Exactly three of the add statements use autoboxing.

public class Question26 {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5")); // autoboxing of int into Integer
        ages.add(Integer.valueOf("6")); // returns an Integer
        ages.add(7); // autoboxing of int into Integer
        ages.add(null);
        for (int age : ages) System.out.print(age);
    }
}

// Hint: 
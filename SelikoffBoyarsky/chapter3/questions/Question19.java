import java.util.*;

// Question: which of the following are true?
// Two arrays with the same content are equal.
// Two ArrayLists with the same content are equal.
// If you call remove(0) using an empty ArrayList object, it will compile successfully.
// If you call remove(0) using an empty ArrayList object, it will run successfully.
// None of the above.

public class Question19 {
    public static void main(String[] args) {
        int[] ia = {1,2,3,4,5};
        int[] ib = {1,2,3,4,5};
        ArrayList la = new ArrayList(ia);
        ArrayList ib = new ArrayList(ib);
        System.out.println();
    }
}

// Hint: 
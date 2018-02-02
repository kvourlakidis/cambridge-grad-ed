// Question: what is the output of this programme?
import java.util.List;
import java.util.ArrayList;

public class Question20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        // list.add(7); // illegal
        for (String s : list) System.out.print(s);
        System.out.println();
    }
}

// onetwo
// onetwo7
// onetwo followed by an exception
// compiler error on line 8
// compiler error on line 9

// Hint: 
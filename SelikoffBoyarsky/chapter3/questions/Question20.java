// Question: 

public class Question20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add(7);
        for (String s : list) System.out.print(s);
    }
}

// onetwo
// onetwo7
// onetwo followed by an exception
// compiler error on line 8
// compiler error on line 9

// Hint: 
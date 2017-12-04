import java.util.*;

// Question: 

public class Question24 {
    public static void main(String[] args) {
        String [] names = {"Tom", "Dick", "Harry"};
        List<String> list = names.asList();
        list.set(0, "Sue");
        System.out.println(names[0]);
    }
}

// Hint: 
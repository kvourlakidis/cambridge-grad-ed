import java.util.*;

// Question: 

public class Question23 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,4,-1,5);
        Collections.sort(list);
        Integer[] array = list.toArray();
        for (Integer i : array) System.out.println(i);
        System.out.println(array[0]);
    }
}

// Hint: 
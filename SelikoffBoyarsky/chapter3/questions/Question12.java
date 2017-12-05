// Question: 

public class Question12 {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8); // "0189"
        numbers.append("-").insert(2, "+"); // "0189-" => "01+89-"
        System.out.println(numbers);
    }
}

// Hint: StringBuilder.delete(start, end)
// Rmoves the substring(start, end) from the string.
// start - inclusive
// end - exclusive
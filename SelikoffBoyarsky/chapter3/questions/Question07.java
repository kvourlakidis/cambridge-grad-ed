// Question: what is the output of this code?

public class Question07 {
    public static void main(String[] args) {
        //                012345
        String letters = "abcdef";
        System.out.println(letters.length());  // 6
        System.out.println(letters.charAt(3)); // d
        System.out.println(letters.charAt(6)); // StringIndexOutOfBoundsException
    }
}

// Hint: 
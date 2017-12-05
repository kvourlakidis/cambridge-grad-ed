// Question: what is the output of this code?

public class Question11 {
    public static void main(String[] args) {
        int total = 0;
        //                                         012345
        StringBuilder letters = new StringBuilder("abcdef");
        total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
        total += letters.substring(6,5).length(); // StringIndexOutOfBoundsException
        System.out.println(total);
    }
}

// Hint: 
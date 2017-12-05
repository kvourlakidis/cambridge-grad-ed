// Question: what is the output of this code?

public class Question13 {
    public static void main(String[] args) {
        //                 012345
        StringBuilder b = "rumble"; // new StringBuilder("rumble");
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);
    }
}

// Hint: "this is a string literal".
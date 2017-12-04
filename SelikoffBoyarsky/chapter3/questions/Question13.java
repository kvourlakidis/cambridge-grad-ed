// Question: 

public class Question13 {
    public static void main(String[] args) {
        //                 012345
        StringBuilder b = "rumble";
        b.append(4).deleteChatAt(3).delete(3, b.length() - 1);
        System.out.println(b);
    }
}

// Hint: 
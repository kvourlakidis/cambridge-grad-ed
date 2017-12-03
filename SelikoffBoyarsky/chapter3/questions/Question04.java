// Question: what is the output of this code?

public class Question04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);        
    }
}

// Hint: 
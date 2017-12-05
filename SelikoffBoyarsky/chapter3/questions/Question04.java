// Question: what is the output of this code?

public class Question04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        //         012          a\bb/aa          abba\ccc/a
        System.out.println(sb);        
    }
}

// Hint: 
// Just remember that ".insert(0," prepends the string.
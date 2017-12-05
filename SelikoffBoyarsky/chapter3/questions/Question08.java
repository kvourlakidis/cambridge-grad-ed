// Question: 

public class Question08 {
    public static void main(String[] args) {
        String numbers = "012345678";
        System.out.println(numbers.substring(1,3)); // "12"
        System.out.println(numbers.substring(7,7)); // ""
        System.out.println(numbers.substring(7));   // "78"
    }
}

// Hint: 
// substring(beginIndex, endIndex)
// The substring inludes the character at the beginIndex
// and excludes the character at the endIndex.
//
// The length of the substring is (endIndex - beginIndex).
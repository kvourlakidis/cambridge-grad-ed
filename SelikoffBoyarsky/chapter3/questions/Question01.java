// Question: what is the output of this code?

public class Question01 {
    public static void main(String[] args) {
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = "" + numFish + 1; // int + int => int
        System.out.println(anotherFish + " " + fishType);
        System.out.println(1 + numFish + 1);
    }
}

// Hint: be careful what you fish for.
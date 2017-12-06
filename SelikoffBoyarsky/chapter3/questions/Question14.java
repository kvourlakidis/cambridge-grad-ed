// Question: which lines will print "avaJ";

public class Question14 {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        // puzzle.reverse(); // "avaJ"
        puzzle.append("vaJ£").substring(0,4); // "Java"
        // puzzle.append("vaJ$").delete(0,3).deleteChatAt(puzzle.length()-1);
        // puzzle.append("vaJ$").delete(0,3).deleteChatAt(puzzle.length());
        System.out.println(puzzle);
    }
}

// Hint: 
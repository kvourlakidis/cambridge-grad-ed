// Question: Which of the following are true?

// An immutable object can be modified.
// An immutable object cannot be modified.
// An immutable object can be garbage collected.
// An immutable object cannot be garbage collected.
// String is immutable.
// StringBuffer is immutable.
// StringBuilder is immutable.


public class Question03 {
    public static void main(String[] args) {
        final String s = "A String that cannot be re-assigned;";
        // s += "or can it?"; // does not compile
        for (int i=1;i<=10;i++) {
            Nester a = new Nester(i);
            a = null; // this line does not compile if a is final
            System.gc();
        }
    }

    // in Greek mythology Nestor was a wise king of Pylos
    static class Nester {
        private int num;
        Nester (int num) {
            this.num = num;
        }

        protected void finalize() {
            System.out.println("Discarding Nester " + num);
        }
    }
}
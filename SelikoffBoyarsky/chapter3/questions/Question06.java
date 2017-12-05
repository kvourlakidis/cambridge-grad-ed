// Question: what is the output?

public class Question06 {

    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!"); // mutates the object
    }

    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Question06().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
    }
}

// Answers:
// roar roar
// roar roar!!!
// roar!!! roar
// roar!!! roar!!!
// An Exception is thrown.
// The code does not compile.
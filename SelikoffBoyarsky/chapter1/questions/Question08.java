public class Question08 {
	public static void main(String[] name) {
		System.out.println(name[1]);
	}
}

// Which of the following calls prints out "Blue Jay" when run from the command line?
// java Question8 Sparrow Blue Jay   // prints: Blue
// java Question8 Sparrow "Blue Jay" // prints: Blue Jay
// java Question8 Blue Jay Sparrow   // prints: Jay
// java Question8 "Blue Jay" Sparrow // prints: Sparrow
// java Question8.class Sparrow "Blue Jay" // Illegal call
// java Question8.class "Blue Jay" Sparrow // Illegal call

// Which lines inside main() don't compile?
// Compile to find out :)

public class Question03 {
	public static void main(String[] args) {
		short numPets = 5;            // line 4
		int numGrains = 5.6;     // line 5
		String name = "Scruffy";      // line 6
		// numPets.length();          // line 7
		// numGrains.length();        // line 8
		name.length();                // line 9
	}
}

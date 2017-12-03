public class Question17 {
	public static void main(String[] args) {
		Question17 iHateBunnies = new Question17();

		System.out.println(Question17.class instanceof Class); // true
		// System.out.println(iHateBunnies     instanceof Class); // illegal
		// System.out.println(main             instanceof Class); // illegal
		System.out.println(Question17.class instanceof Object); // true
		System.out.println(iHateBunnies     instanceof Object); // true
		// System.out.println(main             instanceof Object); // illegal

	}
}

// Which are true?

// 1. Question17 is a class.
// true
// 2. iHateBunnies is a class.
// false, iHateBunnies is an instance object.
// 3. main is a class.
// false, main is a method
// 4. Question17 is a reference to an Object.
// false, Question17 is a class.
// 5. iHateBunnies is a reference to an Object.
// true
// 6. main is a reference to an Object.
// false, main is a method.

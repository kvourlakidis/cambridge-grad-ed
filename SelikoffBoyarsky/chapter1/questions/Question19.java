public class Question19 {
	public static void main(String[] args) {
		Question19 one = new Qustion19();  // one -> A
		Question19 two = new Question19(); // two -> B
		Question19 three = one;            // three -> A
		one = null;                        // one -> null
		Question19 four = one;             // four -> null
		three = null;                      // three -> null (A can be gc'ed)
		two = null;                        // two -> null (B can be gc'ed)
		two = new Question19();            // two -> C
		System.gc();                       // A and B are eligible for GC
}}                                         

/*

Which of the following are true:

The object from line 3 (A) is first eligible for garbage collection immediately following line 6.
The object from line 3 (A) is first eligible for garbage collection immediately following line 8.
The object from line 3 (A) is first eligible for garbage collection immediately following line 12.
The object from line 4 (B) is first eligible for garbage collection immediately following line 9.
The object from line 4 (B) is first eligible for garbage collection immediately following line 11.
The object from line 4 (B) is first eligible for garbage collection immediately following line 12.

*/

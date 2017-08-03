public class Question19 {
	public static void main(String[] args) {
		Question19 one = new Qustion19();  // line 3
		Question19 two = new Question19(); // line 4
		Question19 three = one;            // line 5
		one = null;                        // line 6
		Question19 four = one;             // line 7
		three = null;                      // line 8
		two = null;                        // line 9
		two = new Question19();            // line 10
		System.gc();                       // line 11
}}                                                 // line 12

/*

Which of the following are true:

The object from line 3 is first eligible for garbage collection immediately following line 6.
The object from line 3 is first eligible for garbage collection immediately following line 8.
The object from line 3 is first eligible for garbage collection immediately following line 12.
The object from line 4 is first eligible for garbage collection immediately following line 9.
The object from line 4 is first eligible for garbage collection immediately following line 11.
The object from line 4 is first eligible for garbage collection immediately following line 12.

*/

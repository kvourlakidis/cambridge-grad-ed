public class Question04 {
	// String result = "done"; // fine because shed is not static !!!
	public void shed(boolean time) {
		String result = "done"; // fine because local variable
		if (time) {
			// String result = "done"; // not fine because inside an if block
		}
		System.out.println(result);
		// String result = "done"; // not fine because trying to use "result" in line  above
	}
}

// QUESTION
// Which of the commented out lines can be un-commented to make the class compile?

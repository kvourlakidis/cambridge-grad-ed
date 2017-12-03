public class Question04 {
	// String result = "done1"; // fine because shed is not static !!!
	public void shed(boolean time) {
		// String result = "done2"; // fine because local variable
		if (time) {
			// String result = "done3"; // not fine because inside an if block
		}
		System.out.println(result);
		// String result = "done4"; // not fine because trying to use "result" in line  above
	}
}

// QUESTION
// Which of the commented out lines can be un-commented to make the class compile?

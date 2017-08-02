// comments can be almost anywhere in the source file

class Comments{
	
	public static void main(String[] args){ /* even here */ }

	// simple comments are designated by the leading
	// double-forward-slash and run to the end of the line

	/*
	 * Multiple 
	 * line comment
	 */

	
	/* <- start of comment (required)
	 *
	 * <- not required (but nice)
	 *
	 * end of comment (required) -> */

	/**
	  * Javadoc comment.
	  * As far as the compiler is concerned this is just 
	  * a multi-line comment.
	  * However the 'javadoc' tool uses these commments
	  * to generate documentation for the class or method
	  * which the comment is attached to.
	  * The javadoc is attached to the element which follows
	  * it (without any separating newline).
	  * An example javadoc for a method follows below.
	  */

	/**
	 * Short one line description.
	 * <p>
	 * Longer description can go here.
	 * <p>
	 * Certain HTML mark-up can be used for styling.
	 * Tags on parameters and Class names can be used
	 * to link the javadoc to the documentation for
	 * that particular Class.
	 * <p>
	 * @param param1 Description.
	 * @param param2 Description.
	 *
	 * @return description of returned parameter.
	 */
	public int methodName(Object param1, Object param2) { return 0; }
}

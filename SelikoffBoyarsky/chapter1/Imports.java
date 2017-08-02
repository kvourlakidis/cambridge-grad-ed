// Imports must come after the package declaration, if there is one,
// but before the class declaration.

import java.util.Random; // import tells compiler where to find Random

import java.lang.System; // redundant import
// Everything in "java.lang.*" is available on the classpath by default.

// A wildcard only matches class names in the file (not nested deeper).
// So the following doesn't work (but does compile):
import java.*;

import java.sql.*;
import java.util.Date;

public class Imports {
	public static void main(String[] args) {
		Random rnd = new Random();
	
		// The compiler tries to resolve conflicts.		
		Date date = new Date();
		// date is a java.util.Date even though
		// there is also Date class in java.sql package.
	}
}

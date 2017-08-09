// Given the following separate classes

package aquarium;
public class Water {}

////////////////////////////////////////

package aquarium;

import java.lang.*;       // imported by the JVM by default
import java.lang.System;  // same as above
import aquarium.Water;    // not needed (same package)
import aquarium.*;        // not needed (same package)

public class Tank {
	public void print(Water water) {
		System.out.println(water);
	}
}

// How many of the above imports are redundant?

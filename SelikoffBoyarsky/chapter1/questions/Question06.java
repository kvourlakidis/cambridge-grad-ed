// Given the following separate classes

package aquarium;
public class Water {}

////////////////////////////////////////

package aquarium;

import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;

public class Tank {
	public void print(Water water) {
		System.out.println(water);
	}
}

// How many of the above imports are redundant?

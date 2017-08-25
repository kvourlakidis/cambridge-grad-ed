// Starting in the top left corner of a 2x2 grid,
// and only being able to move to the right and down,
// there are exactly 6 routes to the bottom right corner.
// right -> right -> down  -> down
// right -> down  -> right -> down
// right -> down  -> down  -> right
// down  -> right -> right -> down
// down  -> right -> down  -> right
// down  -> down  -> right -> right
// How many such routes are there in a 20x20 grid?

public class Problem015 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	static int latticePathNumber(int gridSize) {
		int steps = gridSize * 2;
		return factorial(steps - 1);
	}

	static long factorial(int n) {
		long fact = 1;
		for (int i=2;i<=n;i++)
			fact *= i;
		return fact;
	}
}


// For a 3 x 3 grid:
// right -> right -> right x 1
// down  -> down  -> down  x 1

// right -> right -> down  x 3
// right -> down -> right  x 3
// down -> right -> right  x 3

// right -> down -> down   x 3
// down -> right -> down   x 3
// down -> down -> right   x 3

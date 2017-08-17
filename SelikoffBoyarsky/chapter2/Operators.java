public class Operators {
	public static void main(String[] args) {
		int x = 3;
		int y = -x++;
//		System.out.println(y);
//		System.out.println(x);
		boolean z = (-y == --x) ;
		if (z) x = --y;
//		System.out.println(x);

		x = 1;
		y = (--x + x++);
//		System.out.println(y);

		for (int i=0; i++ == 0; i--) 
			System.out.println("So long, suckers!");  
	}
}

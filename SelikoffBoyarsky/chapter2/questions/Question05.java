// Question: what is the output of this program?

public class Question05 {
	public static void main(String[] args) {
		java.util.List<Integer> list = new java.util.ArrayList<Integer>();
		list.add(10);
		list.add(14);
		for (int x : list) {
			System.out.print(x + ", ");
			break;
		}
	}
}

// Answers: []

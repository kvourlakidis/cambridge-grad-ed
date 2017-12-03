public class Question21 {
	int count;

	public void Question21() { // line A
		this.count = 4;         // line B
	}
    
	public static void main(String[] args) {
		Question21 q = new Question21(); // line C
		System.out.println(q.count);     // line D
	}
}

// What does the code above output?
// 0
// 4
// compile error on line A
// compile error on line B
// compile error on line C
// compile error on line D
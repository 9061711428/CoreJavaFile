package wrapper;

public class UnboxingExample {
	public static void main(String args[]) {

		Integer a = new Integer(10);
		int i = a.intValue(); // converting Integer to int
		int j = i; // Unboxing compiler will write a.intValue() internally
		System.out.println(a + " " + i + " " + j);

	}

}

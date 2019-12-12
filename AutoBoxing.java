//program for Autoboxing.
package wrapper;

public class AutoBoxing {
	public static void main(String args[]) {
		Integer i = 20; // converting int into Integer
		Integer j = i; // Autoboxing now compiler will write Integer.valueOf(a) internally
		System.out.println(i + " " + j);

	}

}

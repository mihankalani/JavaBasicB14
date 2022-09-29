package groupProject1;

public class part1Task06 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		int a = 30;
		int b = 10;
		a = a + b;// --->a=40

		b = a - b;// --->b=30
		a = a - b;// --->a=10
		// a=10 b=30

		System.out.println("After Swapping: a=" + a);
		System.out.println("After Swapping: b=" + b);

	}

}

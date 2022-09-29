package groupProject1;

public class part1Task09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array
		int[] num = { 11, 3, 1, 5, 9, 13 };
		int minimum = num[0];
		int maximum = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] - maximum > 0) {
				maximum = num[i];
			}
			if (minimum - num[i] > 0) {
				minimum = num[i];
			}
		}
		System.out.println("Maximum= "+maximum);
		System.out.println("Minimum= "+minimum);
	}

}

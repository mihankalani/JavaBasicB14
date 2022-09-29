package groupProject1;

public class part1Task05 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program
		// which will calculate the sum of even and odd numbers for that array.
		int[][] num = { { 2, 5, 3, 16 }, { 79, 13, 44, 20 }, { 7, 6 } };
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					evenSum +=num[i][j];
				} else {
					oddSum +=num[i][j];
				}
			}
		}
		System.out.println("Sum of even numbers is " + evenSum);
		System.out.println("Sum of odd number is " + oddSum);
	}

}

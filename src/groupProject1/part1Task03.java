package groupProject1;

public class part1Task03 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		int[][] num = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11 } };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}
		}
		System.out.println("sum=" + sum);
	}

}

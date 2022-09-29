package groupProject1;

public class part1Task04 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.
		int[][] num = { { 4, 8, 9 }, { 71, 55, 42, 8 }, { 7, 6, 11, 5 } };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					System.out.print(num[i][j] + " ");
				}

			}
		}

	}

}

package groupProject1;

public class part1Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array
		int[] num = { 17, 15, 13, 9, 11, 3 };
		int secondLargestNumber = 0;
		int largestNumber = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] - largestNumber >= 0) {
				largestNumber = num[i];
			}
		}
		
		for (int j = 0; j < num.length; j++) {
			if (num[j] == largestNumber) {
				continue;
			} else if (num[j] - secondLargestNumber > 0) {
				secondLargestNumber = num[j];
			}
		}
		System.out.println("The second Largest Number is " + secondLargestNumber);
	}

}

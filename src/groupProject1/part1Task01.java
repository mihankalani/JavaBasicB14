package groupProject1;

import java.util.Scanner;

public class part1Task01 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values.After the array is created,
		// calculate the sum of all stored elements in that array.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the size of the array that you want to create");
		int size = scanner.nextInt();
		int[] myArray = new int[size];

		System.out.println("Please enter " + size + " elements");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int newOne : myArray) {
			sum += newOne;
		}

		System.out.println("The sum of all the elemnts is " + sum);
	}

}

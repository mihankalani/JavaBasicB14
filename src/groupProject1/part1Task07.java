package groupProject1;

import java.util.Scanner;

public class part1Task07 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scanner.nextInt();

		int a = num / 2;
		boolean prime = true;

		if (num == 0 || num == 1) {
			System.out.println("Your number is not prime ");
		} else if (num < 0) {
			System.out.println("Your number is invalid");
		} else {
			for (int i = 2; i < a; i++) {
				if (num % i == 0) {
					System.out.println("Your number is not prime number");
					break;
				}
			}

			if (prime) {
				System.out.println("Your number is prime");
			}

		}

	}

}
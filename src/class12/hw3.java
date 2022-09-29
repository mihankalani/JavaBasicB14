package class12;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY Example Output: Mom’s first name? Mary Dad’s first name? Daniel
		 * Boy or Girl? girl Suggested baby name: MAIEL
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter mother's name");
		String nameM = scanner.nextLine();

		System.out.println("Please enter father's name");
		String nameF = scanner.nextLine();

		System.out.println("Is baby boy or girl?");
		String baby = scanner.nextLine();

		int x = 0;
		int y = 0;
		x = nameM.length() / 2;
		y = nameF.length() / 2;
		if (baby.equalsIgnoreCase("boy")) {

			System.out.print("Boy sugested baby name: " + nameF.substring(0, y) + nameM.substring(x, nameM.length()));
		}

		else if (baby.equalsIgnoreCase("girl")) {

			System.out.print("Girl sugested baby name: " + nameM.substring(0, x) + nameF.substring(y, nameF.length()));
		}
	}
}

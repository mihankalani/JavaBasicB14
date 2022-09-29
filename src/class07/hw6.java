package class07;

import java.util.Scanner;

public class hw6 {

	public static void main(String[] args) {
		//Declare a variable to store a price for a coffee. Ask the user to pay for a coffee.
		//Keep asking to pay for coffee until the user enters the EXACT amount .
		//If the user gives more than coffee price --> ask them to give less, if the user gives less money then ask to give more.
		//Once user give EXACT amount print “Please enjoy your coffee
		Scanner scanner=new Scanner(System.in);
		double price=5;
		double amount;
		System.out.println("Enter price");
		amount=scanner.nextDouble();
		do {
		
			if(amount>price) {System.out.println("Please give less");}
			else if(amount<price) {System.out.println("Please give more");}
		}while(price != amount);
		System.out.println("Please enjoy your coffee");
		
		
	}
}

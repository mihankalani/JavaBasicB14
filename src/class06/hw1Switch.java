package class06;

import java.util.Scanner;

public class hw1Switch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scanner.nextLine();
		String language;
		switch(country) {
		case"Iran":
			language="Persian";
			break;
		case "Uk":
			language="English";
			break;
		case "Germany":
			language="Dutch";
			break;
		case "Farance":
			language="French";
			break;
		case "Russia":
			language="Russian";
			break;
			default:
				language="Unknown";
			break;}
		System.out.println("You speak "+language);
			
			
		}
	}


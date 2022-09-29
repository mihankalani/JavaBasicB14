package class06;

import java.util.Scanner;

public class enhanceHW {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=scanner.next();
		String birth=null;
		if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")) { 
		birth="Spring";
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			birth="Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") ||month.equalsIgnoreCase("November")) {
			birth="Fall";
		}else if(month.equalsIgnoreCase("December") ||month.equalsIgnoreCase("January") ||month.equalsIgnoreCase("February")) {
			birth="winter";
		} System.out.println("you were born in season "+birth);
	}

}

package class05;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your birth month");
String month=scanner.next();
if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")) { 
	System.out.println("season=Spring");
}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
	System.out.println("season=Summer");
}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") ||month.equalsIgnoreCase("November")) {
	System.out.println("season=Fall");
}else if(month.equalsIgnoreCase("December") ||month.equalsIgnoreCase("January") ||month.equalsIgnoreCase("February")) {
	System.out.println("season=winter");
}else {
	System.out.println("Invalid month");
}
	}

}

package class06;

import java.util.Scanner;

public class hw1ifElse {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your country");
String country=scanner.nextLine();
String language;
if(country.equalsIgnoreCase("Iran")) {
	language="Persian"; }
else if(country.equalsIgnoreCase("UK")) {
	language="English";}
else if (country.equalsIgnoreCase("Germany")) {
	language="Dutch";}
else if (country.equalsIgnoreCase("France")) {
	language="French";}
else if(country.equalsIgnoreCase("Russia")) {
	language="Russian";}
else {System.out.println("Invalid");
language="Unknown";}
	
System.out.println("You speak "+language);
	

}
}

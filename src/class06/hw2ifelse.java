package class06;

import java.util.Scanner;

public class hw2ifelse {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter your grade");
	char grade=scanner.next().charAt(0);
	String condition;
	if(grade=='A') {
		condition="Excellant";}
	else if (grade=='B') {
		condition="Good";}
	else if(grade=='C') {
		condition="Average";}
	else if(grade=='D') {
		condition="Bad";}
	else {condition="Not acceptable";}
	System.out.println("You are in grade "+grade+" and your situation is "+condition);
	}
	}


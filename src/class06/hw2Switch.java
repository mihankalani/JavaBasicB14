package class06;

import java.util.Scanner;

public class hw2Switch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=scanner.next().charAt(0);
		String condition;
		switch(grade) {
	case 'A':
		condition="Excellant";
		break;
	case 'B':
		condition="Good";
		break;
	case 'C':
		condition="Average";
		break;
	case 'D':
		condition="Bad";
		break;
	default:
		condition="Not Acceptable";
		break;}
	System.out.println("You are in grade "+grade+" and your situation is "+condition);
	
	}

}

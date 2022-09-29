package class05;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("PLease enter your height in inch");
double height=scan.nextDouble();
if(height<60) {System.out.println("Short");
}
else if(height>60 && height<72) {
	System.out.println("medium");
}
else{
	System.out.println("tall");
	}
}
	}

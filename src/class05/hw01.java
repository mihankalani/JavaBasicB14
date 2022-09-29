package class05;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("PLease enter your current time, 24 hour format");
double hour=scanner.nextDouble();
if(hour>1 && hour<11) {
	System.out.println("Morning");
}else if(hour>12 && hour<15) {
	System.out.println("Afternoon");
	}
else if(hour>16 && hour<20) {
	System.out.println("Evening");
}
else if(hour>21 && hour<24) {
	System.out.println("Night");
}else {
	System.out.println("Invalid hour");
}
	}
}

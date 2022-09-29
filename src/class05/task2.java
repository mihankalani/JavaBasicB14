package class05;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("PLease enter day number");
int day=scan.nextInt();
if(day>=1 || day<=5) {
	System.out.println("it is a weekday");
} else if(day==6 || day==7) {System.out.println("it is a weekend");
	}else { System.out.println("Invalid day");}
	}
}

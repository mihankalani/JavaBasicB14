package class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// create secret number till user guess that
Scanner scanner=new Scanner(System.in);
int num=400;
double guess=0.0;
do {
	System.out.println("Please guess the number");
guess=scanner.nextDouble();
}while(guess!=num);
System.out.println("You won");
	}

}

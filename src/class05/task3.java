package class05;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		double num=scanner.nextDouble();
		if(num>0 &&num<1) {
			System.out.println("number is small");
		}else if(num>11 && num<100) {
			System.out.println("number is medium");
		}else if(num>101 && num<1000) {
			System.out.println("number is large");
		}
	}

}

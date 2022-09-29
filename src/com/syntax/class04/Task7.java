package com.syntax.class04;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your years you have worked");
double years=scanner .nextDouble();
if(years>=5)
{System.out.println("You are eligible for bonus");
System.out.println("Please enter your annua salary");
double salary=scanner .nextDouble();
	if(salary>50000) {
		System.out.println("Your bonus is 5000");
	}
	else {
		System.out.println("Your bonus is 3000");
	}
	}
else
{System.out.println("You are not elegible for bonus");}

}

	}


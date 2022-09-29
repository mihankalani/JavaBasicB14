package com.syntax.class04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your age");
double age=scanner .nextDouble();
if(age>=18)
{
	System.out.println("You are eligible for driver's license");
}
else
{
	System.out.println("You can get a permit driver's license");
}
	}

}

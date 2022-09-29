package com.syntax.class04;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have diploma? please enter true or false");
		boolean degree=scanner .nextBoolean();
		if (degree)
		{
		System.out.println("congratulations");
		}
		else
		{
			System.out.println("You should get a degree");
		}
		if(degree)
		{
			System.out.println("Please enter your GPA");
		}
		double gpa=scanner .nextDouble();
		if(gpa>=3.5)
		{
			System.out.println("You are eligible for scholorship");
		}
		else
		{
			System.out.println("You should have studied harder");
		}
	}

}

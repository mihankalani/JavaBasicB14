package com.syntax.class04;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
System.out.println("Do you have credit card? please enter true or false");
boolean creditcard=scanner .nextBoolean();
if(creditcard)
{
	System.out.println("What is balance on the card?");
	double balance=scanner. nextDouble();
	if(balance>1000)
	{
		System.out.println("Please pay off immediately");
	}
	else
	{
		System.out.println("You can spend more");
		}
}
else
{
	System.out.println("Please get credit card");
}

}

 }

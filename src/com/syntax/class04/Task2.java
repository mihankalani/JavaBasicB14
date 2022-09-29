package com.syntax.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter the mortgage rate");
double rate=scanner .nextDouble();
if(rate>4.5)
{
	System.out.println("You can't buy the house");
}
else
{
	System.out.println("You can buy a house");
	System.out.println("How much is the house price?");
}
double price=scanner .nextDouble();
if(price>200000)
{
	System.out.println("You are eligible for loan");
}
else
{
	System.out.println("You should pay cash");	
}
	}

}

package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("How much loan do you need?");
double loan=scanner .nextDouble();
if(loan<=200000)
{
	System.out.println("You are eligible for the loan");
}
else
{
	System.out.println("You aren't eligible for the loan");
}
	}

}

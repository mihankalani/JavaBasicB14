package com.syntax.class04;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your city");
String city=scanner. nextLine();
System.out.println("Please enter temperature of the city in Fahrenheit");
double temperature=scanner. nextDouble();
double celsius=(temperature-32)/1.8;
System.out.println("The temperature of the city "+city+" is "+celsius+" Celsius");
	}

}
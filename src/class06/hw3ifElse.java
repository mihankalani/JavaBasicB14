package class06;

import java.util.Scanner;

public class hw3ifElse {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter first number");
double num1=scanner.nextDouble();
System.out.println("Please ente an operator");
char op=scanner.next().charAt(0);
System.out.println("Please enter second number");
double num2=scanner.nextDouble();
if(op=='+') {
	System.out.println(num1+num2);}
else if(op=='-') {
	System.out.println(num1-num2);}
else if(op=='*') {
	System.out.println(num1*num2);}
else if(op=='/') {
	System.out.println(num1/num2);}
else {
	System.out.println("Error");}
}
	}


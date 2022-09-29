package class06;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
 System.out.println("Please enter your quize score");
 double num1=scanner.nextDouble();
 System.out.println("Please enter your midterm score");
 double num2=scanner.nextDouble();
 System.out.println("Please enter your final score");
 double num3=scanner.nextDouble();
 double average=(num1+num2+num3/3);
 String grade;
 if(average>=90 && average<=100){
	 grade= "A";}
 else if(average>=70 && average<90) {
	 grade= "B";}
 else if(average>=50 && average<70) {
	 grade= "c";}
 else if(average<50) {
	 grade= "F";}
 else {
	 System.out.println("Please enter valid score!");
	    grade ="None";
	}
 System.out.println("Grade: "+grade);
	}
}

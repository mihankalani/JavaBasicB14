package class09;

public class task1 {

	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';    
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println("grade "+grade[1]);
		System.out.println("----------------------------------------------");
		
		char[] grade1= {'A','B','C','D','E','F'};
		
		System.out.println("grade "+grade1[1]);
		

	}

}

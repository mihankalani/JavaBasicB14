package class10;

public class task2 {

	public static void main(String[] args) {
		// Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
		//Then your program should print name of the students that has A and B grade
		String[][] student= {
				{"alam","mihan","tara","sajjad"},
				{"A","B","C","D"}
		};
		 System.out.println(student[0][0]+" has got '"+student[1][0]+"' grade.");
	        System.out.println(student[0][1]+" has got '"+student[1][1]+"' grade. ");

		}
	}

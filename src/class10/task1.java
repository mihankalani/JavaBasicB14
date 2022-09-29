package class10;

public class task1 {

	public static void main(String[] args) {
		// Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
			//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		String[][] name=new String[4][4];
		//row1
		name[0][0]="Mr Smith";
		name[0][1]="Mr Jordan";
		name[0][2]="Mr Jackson";
		name[0][3]="Mr Obama";
		//row2
		name[1][0]="Mrs Smith";
		name[1][1]="Mrs Jordan";
		name[1][2]="Mrs Jackson";
		name[1][3]="Mrs Obama";
		//row3
		name[2][0]="Ms Smith";
		name[2][1]="Ms Jordan";
		name[2][2]="Ms Jackson";
		name[2][3]="Ms Obama";
		//row4
		name[3][0]="Miss Smith";
		name[3][1]="Miss Jordan";
		name[3][2]="Miss Jackson";
		name[3][3]="Miss Obama";
		
		System.out.println(name[1][0]+", "+name[0][3]+", "+name[2][2]+", "+name[3][1]);
	

	}

}

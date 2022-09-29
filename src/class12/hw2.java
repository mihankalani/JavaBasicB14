package class12;

public class hw2 {

	public static void main(String[] args) {
    //Create a String and print it in reverse order (Sunday → yadnuS).
		String name="Mihan";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i)+" ");
		}
	}

}

package class12;

public class hw1 {
	// Create a String and if the String is not empty perform the following:
	// if the String has an odd number of characters and has 3 or more characters,
	// print the character in the middle of the String.

	public static void main(String[] args) {

		int i = 0;
		String name = "mihan is a good student";
		if (name.isEmpty()) {
		} else {
			if (name.length() % 2 != 0 && name.length() >= 3) {
				i = (name.length() - 1) / 2;
				System.out.println(name.charAt(i));
			}
		}
	}
}

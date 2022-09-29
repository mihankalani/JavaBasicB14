package groupProject1;

public class part1Task11 {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings?

		String[] name = { "alam", "mihan", "alam", "tara", "mihan" };
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equalsIgnoreCase(name[j])) {
					System.out.println(name[i] + " and " + name[j] + " are the same");
				}
			}
		}
	}
}

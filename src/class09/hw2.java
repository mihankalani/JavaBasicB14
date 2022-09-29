package class09;

public class hw2 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
String[] animal= {"Lion","Dog","Cat","Hen","Goat"};
for(int i=0; i<animal.length;i++) {
	System.out.print(animal[i]+" ");
}
System.out.println();
System.out.println("------------------------------");

String[] animal1= {"Lion","Dog","Cat","Hen","Goat"};
for(String name:animal1) {
	System.out.print(name+" ");
}


	}
	
}

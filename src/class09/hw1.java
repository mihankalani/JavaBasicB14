package class09;

public class hw1 {

	public static void main(String[] args) {
//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		String[] car= {"BMW","Toyota","Mazda","lexuse","GMS","Hundai"};
		for(int i=0;i<car.length;i++) {
			System.out.print(car[i]+" ");
			
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		String[] car1= {"BMW","Toyota","Mazda","lexuse","GMS","Hundai"};
		for(String name:car1) {
			System.out.print(name+" ");
		}
	
	}

}

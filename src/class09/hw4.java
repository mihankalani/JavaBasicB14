package class09;

public class hw4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int largestNumber=0;
		int[] num= {1,5,7,9,3};
		for(int i=0;i<num.length;i++) {
			if(num[i]-largestNumber>0) {
				largestNumber=num[i];			
			}
		}
		System.out.println("The largest number is "+largestNumber);

	}

}

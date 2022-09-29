package class08;

public class task1 {

	public static void main(String[] args) {
		// sum odd1-50   sum even1-50
		int evensum=0;
for(int num=2;num<=50; num+=2) {evensum=num+evensum;}
System.out.println("even sum="+evensum);
System.out.println(" ");

int oddsum=0;
for(int num1=1;num1<=49; num1+=2) {oddsum=num1+oddsum;}
System.out.println("odd sum="+oddsum);
	
}
	
	}


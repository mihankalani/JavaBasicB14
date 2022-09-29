package class07;

public class hw4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
for(int num=21; num<=49;num+=2) {
	System.out.print(num+" ");
}
System.out.println(" ");
int num1=21;
while(num1<=49) {
	if(num1%2==1) {
		System.out.print(num1+" ");
	}num1++;
}
	}
}

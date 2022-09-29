package class11;

public class phone {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung 
	//with specific  attributes and behaviors.
String name;
String model;
String make;
String color;
int memory;
Double size;

void call() {
	System.out.println("calling is possible by "+name+", "+model);}
void text() {
	System.out.println("you can text with "+name);}
public static void main(String[]args) {
	phone iphone=new phone();
	iphone.name="iphone";
	iphone.model="pro max";
	iphone.memory=512;	
	iphone.call();
	System.out.println("______________________________________");
	
	phone pixel=new phone();
	pixel.name="pixel";
	pixel.size=6.5;
	pixel.color="black";
	pixel.text();
	System.out.println("______________________________________");
	
	phone samsung=new phone();
	samsung.name="samsung";
	samsung.color="white";
	samsung.memory=256;
	samsung.model="S2";
	samsung.text();
	
}
}
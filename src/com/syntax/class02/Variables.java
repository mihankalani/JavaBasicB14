package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Alam";
		String LastName="Kalani";
		char grade='A';
		String city="Ashburn";
		String state="Virginia";
		   long phonenumber=1234567890l;
		   
		   System.out.println("My name is "+name+" and my last name is "+LastName);
		   System.out.println("I am "+grade+" student");
		   System.out.println("I live in "+city+" "+state);
		   System.out.println("And my phone number is "+phonenumber);

		   //changes
		   city="Nyc"; //reassigning
		   state="NY";
		   phonenumber=1239874560l;
		   grade='B';
		   
		   System.out.println("My name is "+name+" and I moved to "+city+" "+state+". My new phone number is "+phonenumber);

		   //rules
		   //1.cannot use keywords as identifiers
		   //String new="Hello"; -> error
		   
		   //2. cannot have spaces in identifiers
		   //String last name="Smith";
		   
		   //3. identifiers cannot start with numbers
		   // int 1number=123; -> error
		   int number1=123;//number can be anywhere after name (identifier)
		   
		   /* 4. identifiers cannot contain any special characters except
		    * boolean hello!=true;
		    * char #chara='A';
		    *
		    * except $ or _
		    */
		   double $price$=9.98;
		   float _price1=1.99F;
		   
	}

}

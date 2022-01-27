package org.scan;

import java.util.Scanner;

public class DataScanner {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the age:");
	byte age=s.nextByte();
	System.out.println("Age:\n"+age);
	System.out.println("Enter the atmpin");
	short atmPin=s.nextShort();
	System.out.println("Atmpin:"+atmPin);
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Name:"+name);
	System.out.println(s.nextLine());
	System.out.println("Enter the another name");
	String name1=s.nextLine();
	System.out.println("The another name:"+name1);
	System.out.println("Enter the gender");
	String nm=s.next();
	char gender=nm.charAt(0);
	System.out.println("gender:"+gender);
	
			
	
}
}
	
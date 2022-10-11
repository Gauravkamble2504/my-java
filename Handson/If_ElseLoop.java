package javaversion;

import java.util.Scanner;

public class If_ElseLoop {

	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	String name = sc.nextLine();
	
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	sc.close();
	
	if( age <= 18)
	{
	System.out.println(name + " you are not applicable for voting");	
	}
	else
	{
		System.out.println(name + " you are applicable for voting");
	}
	}
}
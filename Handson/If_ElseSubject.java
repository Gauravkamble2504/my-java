package javaversion;

import java.util.Scanner;

public class If_ElseSubject {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter mark of 1st subject: ");
		float mark1 = sc.nextInt();
		
		System.out.print("Enter mark of 2nd subject: ");
		float mark2 = sc.nextInt();
		
		System.out.print("Enter mark of 3rd subject: ");
		float mark3 = sc.nextInt();
		
		System.out.print("Enter mark of 4th subject: ");
		float mark4 = sc.nextInt();
		
		System.out.print("Enter mark of 5th subject: ");
		float mark5 = sc.nextInt();
		sc.close();
		
		float mark = mark1+mark2+mark3+mark4+mark5;
		float totalmark = 500;
		
		float percentage = mark/totalmark*100;
		
	
		
		if(mark < 300)
		{
			System.out.println("Oops!! You are fail." + name);
			System.out.println("You got: " +  percentage + "%");
		}
		else
		{
			System.out.println("Congrates "+ name + " you are pass.");	
			System.out.println("You got: " +  percentage + "%");
		}
	}
}

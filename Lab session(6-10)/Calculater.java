/*
 :Create a program for calculation.read three values

from the user for operation first and second values as operands.

third value as operator. if user press1 => print addition of first

and second if user press2 => print subtraction of first and second

if user press3 => print multiplication of first and second if user press4 => print division of first and second Take input from the user
 
 Author :- gaurav kamble
 Date:-6/10/22
 */



package myjava;
import java.util.Scanner;
public class Calculater {
	
		void calculation()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter First number: ");
			int a = sc.nextInt();
			
			System.out.print("Enter Second number: ");
			int b = sc.nextInt();
			
			System.out.println("Enter 1 for addition :-");
		
		
			System.out.println("Enter 2 for substraction :-");
			
			
			System.out.println("Enter 3 for multiplication :- ");
			
			
			System.out.println( "Enter 4 for division :-");
			int c = sc.nextInt();
			sc.close();
			
			
			int w = a+b;
			int x = a-b;
			int y = a*b;
			int z = a/b;              
			
			
			if(c == 1)
			{
				System.out.println("Addition of: " + a + " + " + b + " = " +w);
			}
			
			else if(c == 2)
			{
				System.out.println("Subtraction of: " + a + " - " + b + " = " +x);
			}
			
			else if(c == 3)
			{
				System.out.println("Multiplication of: " + a + " X " + b + " = " +y);
			}
			
			else if(c == 4)
			{
				System.out.println("Division of: " + a + " / " + b + " = " +z);
			}
		}
	}



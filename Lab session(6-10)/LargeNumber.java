/*
 Create a program to find largest of two numbers.
 Author :- gaurav kamble
 date:- 6/10/22
 */



package myjava;
import java.util.Scanner;
public class LargeNumber 
{

	void number()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your First Number :- ");
		int x = sc.nextInt();
		
		System.out.println("Enter your Second Number :- ");
		int y = sc.nextInt();
	    sc.close();
		
	    if(x > y) 
	    {
			System.out.println("\n The Largest Number = " + x);          
	    } 
	    else if (x < y)
	    { 
	    	System.out.println("\n The Largest Number = " + y);        
	    } 
		}
}

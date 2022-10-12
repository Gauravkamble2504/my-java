/*
topic : program to demostrate while loop continue till the number is positive 
name : Gaurav kamble
date : 12/10/2022

*/

package javaprojrct;

import java.util.Scanner;

public class Do_while {
	
	public static void main (String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int y = sc.nextInt();
				
		sc.close();	
		for(int b = y ; b>=0; --b)
		{
		 do
		 {
			 
		  System.out.println("the reverse of number"+ b );
		  break;
		 }
		while(b>=10);
} 
}
}
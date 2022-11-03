/*Write a Java program to check if a particular element exists in a linked list.
Name:Gaurav kamble
Date:3-11-22
*/



package Gaurav;

import java.util.*;
import java.util.Scanner;

 class LinkedList_Exist {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		LinkedList<String> chr= new LinkedList();
		String Name = sc.nextLine();
		switch (Name)//Switch Case
		{
		case "a":
			System.out.println("shivam");
			break;
		case "b":
			System.out.println("masud");
			break;
		case "c":
			System.out.println("pranay");
			break;
		case "d":
			System.out.println("bhakti");
			break;
		case "e":
			System.out.println("adarsh");
			break;
			//When the user put default value
		default: 
		{
			System.out.println(" Please!! Enter Character");
		}
		
	}

	}

}

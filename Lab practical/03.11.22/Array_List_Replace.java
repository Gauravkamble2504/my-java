/*Write a Java program to replace the second element
	of a ArrayList with the specified element.
	Name: Gaurav Kamble
	Date:03-11-22
	*/
package Gaurav;
import java.util.*;
   class Array_List_Replace {
		
		//Main MAthod
		public static void main(String []args)
		{
			
			ArrayList<String> var = new ArrayList();
			//Using Add() Method 
			var.add("bhakti");
			var.add("vishal");
			var.add("pranay");
			var.add("shivam");
			System.out.println("ArrayList is "+var);
			//Take set() Method to repalce
			var.set(1,"masud");
			
			System.out.println("Replace Array List"+var);
		}

	}




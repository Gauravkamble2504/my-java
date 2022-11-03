/*Write a Java program to compare two sets and retain elements 
which are same on both sets.(use retainAll method)
Name: Gaurav kamble
Date:3-11-22
*/


package Gaurav;

import java.util.*;

class Retain_Method {

	public static void main(String[] args)
	{	
			ArrayList<String> var = new ArrayList();
			//Using Add() Method 
			var.add("masud");
			var.add("adarsh");
			var.add("bhakti");
			var.add("pranay");
			
			System.out.println("ArrayList of fist Names "+var);
			
			ArrayList<String> var1 = new ArrayList();
			//Using Add() Method 
			var1.add("harshad");
			var1.add("masud");
			var1.add("vishal");
			var1.add("vikram");
			
			System.out.println("ArrayList of second Names "+var1);
			
			//Applying retainall() method
			var.retainAll(var1);
			System.out.println("after retain :");
			
			System.out.println("retain element "+var);
	}
}


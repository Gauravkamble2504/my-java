/*
Write a Java program to change priorityQueue to maximum priorityqueue.(you can use any loop)
Name:-Gaurav
date: 3-11-22
*/






package Gaurav;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

   class Priority_Queue {
	public static void main(String[]  args) {
		
		Queue<Integer> var = new PriorityQueue<>(Collections.reverseOrder());
		//Using Add() Method 
		var.add(9);
		var.add(15);
		var.add(23);
		var.add(44);
		
		System.out.println("ArrayList of obj is "+var);
		
		Integer val = null;
		// While Loop
		while((val = var.poll()) != null)
		{
			System.out.print(val+" ");
		}
		System.out.println(" ");
	}

}




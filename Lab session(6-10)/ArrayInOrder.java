package javapractical;

import java.util.*;
public class ArrayInOrder {
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number For Array");
		int x = sc.nextInt();
		Integer array[]=new Integer[x];
		
		System.out.println("Enter elements ");
		
		for(int i=0;i<x;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Descending array is" + Arrays.toString(array));
		
		for(int i=0;i>x;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Descending array is" + Arrays.toString(array));
		sc.close();
	}
	
}

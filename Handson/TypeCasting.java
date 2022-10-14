package javaprojrct;

import java.util.Scanner;

public class TypeCasting {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = sc.nextInt();
		sc.close();
		long k = a;
		float l = k;
	
		System.out.println("the value of int is : "+a);
		System.out.println("the value of float is : "+l);
		System.out.println("the value of long is : "+k);
	}
}
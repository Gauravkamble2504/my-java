/*
 Q.2= create a class parent with default constructor and

void sing method.print something inside the constructor and method

Create child class which will inherit the property of

parent and has methods void speak and void dance.print something inside the two methods. Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program.

Author:- Gaurav Kamble
 Date:- 6/10/2022
 */


package myjava;

public class Inheritance 
{


	public static void main(String arg[])
	{
		Child1 I = new Child1();
		I.dance();
		I.speak();
		I.sing();
	}
}

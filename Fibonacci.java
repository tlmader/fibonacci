/* Fibonacci.java
*
*  Description: This class contains a recursive method to calculate the first n
*  Fibonacci numbers. 
*
*  Author: Ted Mader, 3/12/2014
*/

import java.util.Scanner;

public class Fibonacci
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter number to calculate the Fibonacci number: " );
		
		int number = input.nextInt();
		int result = fib( number );
		
		System.out.println( "Fibonacci number is: " + result );
	}
	
	public static int fib( int n )
	{
		if( n == 0 || n == 1)
		{
			return n;
		}
		
		else
		{
			return fib( n - 2 ) + fib( n - 1 );
		}
	}
}
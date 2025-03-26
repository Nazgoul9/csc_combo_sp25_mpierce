package sandbox;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	//	System.out.println("please enter a number to count down from");
		String str = "";
		if(str.length()==0)System.out.println("the string is 0");
		
		
		
		

	
	
	}
	private	static void blastoff(int n) {
		System.out.println();
	}
	
	private static void ForeverString(String s) 
	{
		if (s.length()==0) return;
		System.out.println(s);
		ForeverString(s.substring(1))
	}
	private static int factorial(int n) {
		if(n==0)return 1;
		return factorial(n-1)*n;
	}
	private static int fib(int n) {
		if(n==0)return 0;
		if (n==2||n==1)return 1;
		return fib(n-1)+fib(n+2);
	}
	private static void displaybin(int n) {
		if(n>0) {
			displaybin(n/2);
			System.out.print(n%2);
		}
	}
	

}

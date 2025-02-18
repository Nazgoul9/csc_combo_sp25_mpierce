package loopsassignment;

import java.util.Scanner;

public class forfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x = 1;//second number to set to fib(z) before addition
		int y = 0;//last number gets set to x after addition
		int z = 1;//first number that holds fib
		int i = 0;//incriment holder
		System.out.println("how many numbers do you want to print from the fibonacci sequence");
		int itterate = input.nextInt();
		System.out.println(0);
		for (i=0;i<itterate;i++) {
			x=z;
			System.out.println(z);
			z=x+y;
			y=x;
		}
		System.out.println("your final number is: "+y);
	}

}

package inclassmethods;

import java.util.Scanner;

public class floatingpointnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a floating point number");
		double num = input.nextDouble();
		floatcheck(num);
	}

	private static void floatcheck(double num) {
		double absnumb=Math.abs(num);
		
		if(num ==0)
		{
			System.out.print("zero ");
		}
		else if(num > 0)
		{
			System.out.print("positive ");
		}else
		{
			System.out.print("negetive ");
		}
		if(absnumb<1) System.out.println("small");
		if(absnumb>1000000) System.out.println("large");
		
		
	}

}

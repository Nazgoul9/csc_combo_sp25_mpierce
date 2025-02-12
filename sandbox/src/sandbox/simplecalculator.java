package sandbox;

import java.util.Scanner;

public class simplecalculator {
	/************************
	 * a simple calculator	*
	 * that does algebraic 	*
	 * calculations			*
	 ************************/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("what operation do you want me to perform?");
		System.out.println("addition(add), subtraction(sub), multiplication(mult), devision(div)");
		String operation = input.next();
		System.out.println("please input two numbers, the first will be operated on by the seccond");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		switch (operation)
		{
		case "add":
			add(num1,num2);
			break;
		case "sub":
			sub(num1,num2);
			break;
		case "mult":
			mult(num1,num2);
			break;
		case "div":
			div(num1,num2);
			break;
		}
	}

	private static void div(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 == 0)
		{
			System.out.println("cant devide by zero!");
			return;
		}
		System.out.printf("%d divided by %d = %d",num1,num2,num1/num2);
	}

	private static void mult(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.printf("%d multiplied by %d = %d",num1,num2,num1*num2);
	}

	private static void sub(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.printf("%d subtracted by %d = %d",num1,num2,num1-num2);
	}

	private static void add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.printf("%d added by %d = %d",num1,num2,num1+num2);
	}
}

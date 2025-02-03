package hellocsc_combo;

import java.util.Scanner;

public class hellocsc_combo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("hello combo class how are ya?");
		
		String answer = input.nextLine();
		
		System.out.println("you said: " + answer +"!");
		
		System.out.println("enter two numbers:");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println(sum);
	}

}

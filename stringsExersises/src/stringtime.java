

import java.util.Scanner;

public class stringtime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a word");
		String word = input.next();
		System.out.println("enter seccond word");
		word += input.next();
		System.out.println(word);
		if(word.endsWith("ly"))System.out.println("yay");

	}

}

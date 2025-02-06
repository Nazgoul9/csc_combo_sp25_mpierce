package inputchecklist;

import java.util.Scanner;

public class inputCheckList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word;
		int intnum;
		float realnumb;
		double biggerrealnum;
		char letter;
//		System.out.println("the word goes here");
//		word = input.next();
//		System.out.println("words go here " + word);
//		System.out.println("the int goes here");
//		intnum = input.nextInt();
//		System.out.println("yay, an int "+intnum);
//		System.out.println("the floating decimal point goes here");
//		realnumb = input.nextFloat();
//		System.out.println("yay a floating decimal point "+realnumb);
		System.out.println("the large floating decimal point goes here");
		biggerrealnum=input.nextDouble();
		System.out.println("yay a large floating decimal point"+biggerrealnum);
		System.out.println("the leter goes here");
		letter = input.next().charAt(0);
		System.out.println("yay a letter " + letter);
		
	}

}

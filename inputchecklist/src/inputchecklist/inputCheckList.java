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
		System.out.println("the sentence goes here");
		word = input.nextLine();
		System.out.println("words go here " + word);
		System.out.println("the int goes here");
		intnum = input.nextInt();
		System.out.println("yay, an int "+intnum);
		System.out.println("the floating decimal point goes here");
		realnumb = input.nextFloat();
		realnumb = realnumb + realnumb;
		System.out.printf("%s,%.9f","yay a floating decimal point ",realnumb);
		System.out.println("the large floating decimal point goes here");
		biggerrealnum=input.nextDouble();
		biggerrealnum = biggerrealnum + biggerrealnum;
		System.out.printf("%s %.9f","yay a large floating decimal point",biggerrealnum);
		System.out.println("the leter goes here");
		letter = input.next().charAt(0);
		System.out.println("yay a letter " + letter);
//		
//		String str = "hello world";
//		str = str.toUpperCase();
//
//		System.out.println(str);
//		outputs:HELLO WORLD
		
	}

}

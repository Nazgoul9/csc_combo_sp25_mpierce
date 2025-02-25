package sandbox;

import java.util.Scanner;

public class scope {
   public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("roman alphabet:");
//		for (char c = 'A'; c<='Z';c++)
//			System.out.println(c);//prints out a through z in all caps
//			//if we try to output "c + ' '" it outputs a sequence of numbers
//			//if we want a space we need to use double quotes for a string
//		
//		
//		System.out.println("greek alphabet:");
//		for(int i = 913; i<=937; i++);{
//			System.out.println((char)i +" ");
//		}
//		
//		System.out.println("enter a number");
//		while(!input.hasNextDouble())
//		{
//			String word = input.next();
//			System.err.println(word + "is not a number");
//			System.out.println("enter a number");
//			
////		
		String fruit = "blueberry";
//		for(int i = 0;i< fruit.length();i++) {
//			char letter = fruit.charAt(i);
//			if (letter == 'b') System.out.print(fruit.charAt(i));
//			System.out.println(letter);
		
		System.out.println(reverse(fruit));
		
		System.out.println(fruit.indexOf('b',1));
		
		System.out.println(fruit.substring(0,4));
		System.out.println(fruit.substring(4));
	}
		

// how we reverse a string
	public static String reverse(String s)
	{
		String r = "";
		for (int i= s.length() - 1; i>= 0; i--)
			r+= s.charAt(i);
	return r;	
	}
	

}

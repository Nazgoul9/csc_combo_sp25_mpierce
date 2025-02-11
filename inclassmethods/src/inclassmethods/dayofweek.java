package inclassmethods;

import java.util.Scanner;

public class dayofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number between 1-7");
		
		int day = input.nextInt();
		
		System.out.println(dayofweek(day));
		
		
		

	}

	private static String dayofweek(int day) {
		switch(day)
		{
		case 1:
			return "sunday";
		case 2:
			return "monday";
		case 3:
			return "tuesday";
		case 4:
			return "wednesday";
		case 5:
			return "thursday";
		case 6:
			return "friday";
		case 7:
			return "saturday";
		}
	
	}

}

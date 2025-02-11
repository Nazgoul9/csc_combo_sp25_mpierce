package inclassmethods;

import java.util.Scanner;

public class positivenums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int numb;
		System.out.println("enter a number and ill tell you if its positive");
		numb= input.nextInt();
		
		if(ispositive(numb))
		{
			System.out.println("yay a positive number");
		
		}else
		{
			System.out.println("a  not positive number");
		}
			

	}

	private static boolean ispositive(int numb) {
		// TODO Auto-generated method stub
		return numb>=0;
	}
	
	
	

}

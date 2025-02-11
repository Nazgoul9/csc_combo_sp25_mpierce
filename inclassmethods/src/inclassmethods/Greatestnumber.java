package inclassmethods;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input three numbers and ill tell you the greatest");
		

		int numb1 =input.nextInt();
		int numb2 =input.nextInt();
		int numb3 =input.nextInt();
		
		
		int greatestnum = greatestnum( numb1, numb2,numb3 );
		
		System.out.println("the greatest number is: " + greatestnum);

	}

	private static int greatestnum(int numb1, int numb2, int numb3) {
		// TODO Auto-generated method stub
		
		if(numb1>numb2 && numb1>numb3) return numb1;
		if(numb2>numb1 && numb2>numb3) return numb2;
		return numb3;
	}

}

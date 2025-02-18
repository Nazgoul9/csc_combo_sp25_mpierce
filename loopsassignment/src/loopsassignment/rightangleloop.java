package loopsassignment;

import java.util.Scanner;

public class rightangleloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("how tall would you like your triangle");
		int hight=input.nextInt();
		for(int i =1;i<=hight;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
		System.out.println();
		}

	}

}

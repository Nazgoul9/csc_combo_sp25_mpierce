package inclassmethods;

import java.util.Random;
import java.util.Scanner;


public class method_printf_checksheet {

	static Scanner input = new Scanner(System.in);//static lets use use it everywhere
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("how many random numbers do you want?");
		int table = input.nextInt();

		paramcheck(table);
	

	}

	private static void paramcheck(int i) {
		boolean goodinput=true;
		while (goodinput)
			if (i<10||i>500) {
				System.out.println("please enter a number between 10 and 500");
				i = input.nextInt();
			}
			else goodinput=false;
		System.out.println("please enter the lowest random number you want");
		int lowran = input.nextInt();
		System.out.println("please enter the highest random number you want");
		int highran = input.nextInt();
		int swicharo = 0;
		if (highran<lowran) {
			swicharo=highran;
			highran=lowran;
			lowran=swicharo;
			}
		highran -= lowran;
		randomtable(table,lowran,highran);
		
	}

	private static void randomtable(int i,int j, int k) {
		Random random = new Random();
		int randnum;
		int count = 1;
		
		System.out.printf("%22s RANDOM TABLE\n"," ");
		while (count <= i) {
			randnum=random.nextInt(k)+j;
			System.out.printf("%5d",randnum);
			if (count % 7==0)System.out.println();
			count++;
		
	}

	}
}

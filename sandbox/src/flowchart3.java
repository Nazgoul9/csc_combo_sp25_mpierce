package sandbox;

import java.util.Scanner;

public class flowchart3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int carcode,days,miles,ppd;
		double ppm, total;
		
		System.out.println("what is the car code");
		carcode=input.nextInt();
		System.out.println("how many miles were driven?");
		miles=input.nextInt();
		System.out.println("how many days?");
		days = input.nextInt();
		if (carcode==1)
		{
			
			ppd=75;
			ppm=1.5;
			
		}else if(carcode==2)
		{
			ppd=45;
			ppm=.85;
		}else
		{
			ppd=35;
			ppm=.45;
		}
		
		
		total=(ppm*miles)+(ppd*days);
		
		System.out.printf("your total is $%.2f\n",total);
		input.close();
		
	}
	
	

}

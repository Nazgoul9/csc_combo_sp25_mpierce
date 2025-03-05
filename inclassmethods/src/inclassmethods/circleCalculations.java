package inclassmethods;

import java.util.Scanner;

public class circleCalculations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input the radius");
		double r = input.nextDouble();
		System.out.println("the diameter is "+diametermath(r));
		System.out.println("the cercumfrence "+circumfrencemath(r));
		System.out.println("the area is "+areamath(r));
	}

	private static double diametermath(double r) {
		double diam =(r*2); 
		return diam;
	}

	private static double circumfrencemath(double r) {
		double circ=((Math.PI*r)*2);
		return circ;
	}

	private static double areamath(double r) {
		double area=((r*r)*Math.PI);
		return area;
	}

}

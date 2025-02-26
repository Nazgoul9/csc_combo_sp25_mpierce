/**
* this is a converter from fahrenheit to celsius and kelvin
* 
* 
*@author morga
*@date 2/17/25 
*/

package sandbox;

import java.util.Scanner;

public class tempconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double fahrenheitcelsius = (0.55555);
		double celsiuskelvin = -273.1;
		System.out.println(fahrenheitcelsius);
		System.out.println(celsiuskelvin);
		int fahren = 0;
		double cel = 0;
		double kel = 0;
		System.out.println("please enter a tem in fahrenheit");
		fahren = input.nextInt();
		cel = (fahren - 32) * fahrenheitcelsius;
		kel = cel +celsiuskelvin;
		System.out.printf("that is %.2f degrees celsius and %.2f degrees kelvin", cel, kel);
		
		

	}

}

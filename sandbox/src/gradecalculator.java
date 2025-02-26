/** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * this is a grade calculator for this class
 * here is the different letter grades that will be given
 * [92, ∞): A
 *[89, 92): A-
 *[87, 89): B+
 *[82, 87): B
 *[79, 82): B-
 *[77, 79): C+
 *[72, 77): C
 *[69, 72): C-
 *[67, 69): D+
 *[60, 67): D
 *[0, 60): F
 *
 *@author morga
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package sandbox;

import java.util.Scanner;

public class gradecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter your numeric grade in the class");
		int classpercent = input.nextInt();
		String lettergrade = "a";
		if (classpercent >= 92) {
			lettergrade = "A";
		}else if (classpercent >= 89) {
			lettergrade = "A-";
		}else if (classpercent >= 87) {
			lettergrade = "B+";
		}else if (classpercent >= 82) {
			lettergrade = "B";
		}else if (classpercent >= 79) {
			lettergrade = "B-";
		}else if (classpercent >= 77) {
			lettergrade = "C+";
		}else if (classpercent >= 72) {
			lettergrade = "C";
		}else if (classpercent >= 69) {
			lettergrade = "C-";
		}else if (classpercent >= 67) {
			lettergrade = "D+";
		}else if (classpercent >= 60) {
			lettergrade = "D";
		}else{
			lettergrade = "F";
		}
		if (classpercent>=82) {
			System.out.printf("your letter grade grade is %S, exelent work",lettergrade);
		}else if(classpercent<60) {
			System.out.printf("your letter grade grade is %S, you failed",lettergrade);
		}else {
		System.out.printf("your letter grade grade is %S",lettergrade);
		}
	}

}

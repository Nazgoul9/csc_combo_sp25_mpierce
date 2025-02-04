package hellocsc_combo;
import java.util.Scanner;
public class cmConversion {
	public static void main(String[] args) {
			int inch;
			double cm;
			final double cm_per_inch = 2.54;
			Scanner input = new Scanner(System.in);
			
//			System.out.println("how many inches?");
//			inch = input.nextInt();
//			
//			cm = inch * cm_per_inch;
//			System.out.printf("%d %s %.2f %s", inch, " inch = ", cm, "cm");
//			System.out.println("how many cm?");
//			cm = input.nextDouble();
//			inch = (int) (cm / cm_per_inch);
//			System.out.println(inch);
//			
			System.out.println("give a double digit number of inches");
			inch = input.nextInt();
			
			int feet= inch/ 12;
			int leftoverinches = inch % 12;
			
			System.out.printf("%d%s%d%s%d%s",inch," inches is ",feet, " feet and ", leftoverinches, " inches");
			
	}

}

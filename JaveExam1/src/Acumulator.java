import java.util.Scanner;

public class Acumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int stop = 1;
		int x =0;
		while(stop!=0) 
		{
			System.out.println("please enter a number");
			stop=input.nextInt();
			x+=stop;
		}
		System.out.printf("the sum of all the numbers you entered is %d",x);
		input.close();
	}

}
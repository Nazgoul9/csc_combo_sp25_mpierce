import java.util.Scanner;

public class Devider {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter two numbers");
		double x = input.nextDouble();
		double y = input.nextDouble();
		while(y==0) {
			System.out.println("please enter a non zero number");
			y=input.nextDouble();
		}
		double ans = x/y;
		System.out.printf("the answer is %.2f if you devide %.2f by %.2f",ans,x,y);
		
		input.close();	
	}

}

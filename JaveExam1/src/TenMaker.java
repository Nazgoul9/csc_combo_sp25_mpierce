import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("please input two numbers");
		int x = input.nextInt();
		int y = input.nextInt();
		if(tenmaker(x,y)) {
			System.out.print("im sorry but ");
			System.err.print(x);
			System.out.print(" and ");
			System.err.print(y);
			System.out.print(" do not add up to ten thanks for playing!");
		}else System.out.printf("yay! %d and %d add up to ten thanks for playing!",x,y);

	input.close();
	}

	private static boolean tenmaker(int x, int y) {
		
		int sum= x+y;
		if(sum==10)return false;
		else return true;
	}

}

import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("welcome to beverage roullette, please pick from 1,2, and 3");
		int bev = input.nextInt();
		if(bev>3||bev<1) {
			boolean newbev = false;
			while(newbev==false) {
				System.out.print("im sorry but ");
				System.err.print(bev);
				System.out.println(" is not an option please chose from 1,2 or 3");
				bev = input.nextInt();
				if(bev<=3&&bev>=1)newbev=true;
			}
		}
		if(bev==3)System.out.println("congrats you got coffee!");
		else if(bev==2)System.out.println("congrats you got coke");
		else System.out.println("oh well you got water, plain borring water");
		input.close();
	}

}
/**
 * prints 10x10 multiply table
 * using nested for loops
 * itterates from 1 to 10
 */


package sandbox;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10;i++) {
			for (int j=1;j<=10;j++) {
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}
		

	}

}

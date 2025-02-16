package sandbox;

public class FUNCTIONTESTSPACE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 2;
		int Y = 3;
		int z = 5;
		ADD(X,Y);
		System.out.println(ADD(X,Y));
		System.out.println(ADD(X+z,Y));
		System.out.println(ADD(ADD(X,z),Y));
		while (X<10){
			System.out.println(X);
			X=X+1;
		}
		X=0;
		}
		

	

	private static int ADD(int x, int y) {
		// TODO Auto-generated method stub
		int sum = x+y;
		
		return sum;
	}
	
	

}

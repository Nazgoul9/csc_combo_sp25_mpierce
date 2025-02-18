package loopsassignment;

public class sumofwhilenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;//final sum output
		int add=0;//the number added to sum
				
		while(add<10)
		{
			add++;
			sum+=add;
		}
		System.out.printf("the sum of all numbers from 1 to 10 is %d ",sum);
	}	
}

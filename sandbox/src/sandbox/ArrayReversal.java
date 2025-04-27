package sandbox;
import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int index = 0;
		int[] arr = new int[100];
		int arrinput = 0;
		System.out.println(
				"please start entering integers over 0. \n the numbers you entered will be printed in reverse.\n Order once your done by entering 100 integers or entering -1");
		arrinput = input.nextInt();		
		while (arrinput != -1&&index<100) {
			arr[index] = arrinput;
			index++;
			arrinput = input.nextInt();
		}
		int[] reverse = new int[100];
		printArray(arr,"your input");
		for (int i = 0; i < (arr.length); i++)
			reverse[i]=arr[arr.length-(1+i)];
		printArray(reverse, "your input reversed");
	}
	
	public static void printArray(int[] myArray, String name) {
		System.out.println(name);
		for (int i = 0; i < myArray.length; i++) {
			if(i%10==0)System.out.println();
			System.out.print(myArray[i] + "  ");
		}
		System.out.println();
	}
}

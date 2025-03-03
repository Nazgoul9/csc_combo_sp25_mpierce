import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class arrayWhateverIWant {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int[] myArray = new int [10];
		for(int i =0; i< myArray.length; i++) 
		{
			myArray[i] = rand.nextInt(100)+1;
		}
//		System.out.println(myArray[3]);//printing the third number in the array
		
		System.out.println("\n");
		System.out.println("array 1");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]+" ");
			if(i==4)System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("array 2");
		int[] myArray2 = new int[20];
		for(int i = 0; i<myArray.length;i++) {
			myArray2[i] = myArray[i];
		}
		for(int i = 0; i < myArray2.length;i++) {
			System.out.print(myArray2[i]+" ");
			if(i%5==0&&i!=0){System.out.println();
			}
			}
			System.out.println("\n");
			System.out.println("copy of first five of array 2");
			int[] copy = Arrays.copyOf(myArray2, 5);
			for (int j = 0; j < copy.length; j++) {
				System.out.print(copy[j]+" ");
			}
//			system.out.println();
//			System.out.println("what are you looking for");
//			int find = input.nextInt();
//			System.out.println(findvalue(myArray2,find));
//					
			System.out.println("\n");
			System.out.println("array 3 (reversed array 2)");
			int myArray3[] = new int[myArray2.length];
			for (int i = 0; i < myArray3.length; i++) {
				myArray3[i]= myArray2[myArray2.length-(1+i)];
				System.out.print(myArray3[i]+" ");
				if(i%5==0&&i!=0)System.out.println();
				
			}
			System.out.println("\n");
			System.out.println("find common number array test");
			for (int i = 0; i < myArray2.length; i++)System.out.print(myArray2[i]+" ");
			System.out.println();
			for (int i = 0; i < myArray3.length; i++)System.out.print(myArray3[i]+" ");
			System.out.println();
			System.out.println(findcommon(myArray2,myArray3));
	
	}
	public static boolean findvalue(int[] arr, int value)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==value)return true;
		}return false;
	}
	public static String findcommon(int arr1[],int arr2[]) 
	{
		int common[];
		if(arr1.length>arr2.length)common = new int[arr1.length];
		else common= new int[arr2.length];
		int i = 0;
		for (int m = 0; m < arr1.length; m++) {
			for (int n = 0; n < arr2.length; n++) {
				if(arr1[m]==arr2[n]&&arr1[m]!=common[i]) {
					common[i]=arr1[m];
					i++;
				}
				
			}
		}
		return Arrays.toString(common);
	} 
}





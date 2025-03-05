import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class arrayWhateverIWant {
	static Random rand = new Random();
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] myArray = new int [10];
		buildArray(myArray);
//		System.out.println(myArray[3]);//printing the third number in the array
		
		System.out.println("\n");
		printArray(myArray,"myArray");
		System.out.println("\n");
		System.out.println("array 2");
		int[] myArray2 = new int[20];
		buildArray(myArray2);
		printArray(myArray2,"myArray2");
			System.out.println("\n");
			System.out.println("copy of first five of array 2");
			int[] copy = Arrays.copyOf(myArray2, 5);
			for (int j = 0; j < copy.length; j++) {
				System.out.print(copy[j]+" ");
			}
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
			printArray(myArray,"myArray");//Outputting first array that we are comparing
			printArray(myArray2,"myArray2");//Outputting second array that we are comparing
			System.out.println(findcommon(myArray,myArray2));
			
			System.out.println();
			System.out.println("findevenodd array test");
			printArray(myArray2,"myArray2");
			System.out.println(findevenodd(myArray2));
			int array[] = new int[10];
			buildArray(array);
			printArray(array,"array");

//			system.out.println();
//			System.out.println("what are you looking for");
//			int find = input.nextInt();
//			System.out.println(findvalue(myArray2,find));
//			
			
	
	}
	public static void printArray(int[] myArray,String name) {
		System.out.println(name);
		for (int i = 0; i < myArray.length; i++) System.out.print(myArray[i]+" ");
		System.out.println();
	}
	public static String findevenodd(int[] arr) {
		int evens = 0;
		int odds = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)evens++;
			else odds++;
		}
		return "there are "+evens+" even numbers and "+odds+" odd numbers";
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
	public static int[] buildArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)arr[i]=rand.nextInt(100)+1;
		return arr;
	
	}
	public static void reverse() 
	{
		
	}	
	
}





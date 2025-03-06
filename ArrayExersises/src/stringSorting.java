import java.util.Scanner;

public class stringSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input the amount of strings you will input");
		String stng[]=new String[input.nextInt()];
		for (int i = 0; i < stng.length; i++) {
			System.out.println("please enter a string");
			stng[i]=input.next();
			}
		String stng2[]= new String[stng.length];
		stng2=reverse(stng);
		printArray(stng, "string 1");
		printArray(stng2,"string 2");
		sortAZ(stng);
		printArray(stng,"sorted string");
		

	}
	
	public static void printArray(String[] myArray,String name) {
		System.out.println(name);
		for (int i = 0; i < myArray.length; i++) System.out.print(myArray[i]+" ");
		System.out.println();
	}
	public static String[] reverse(String str[])
	{
		for (int i = 0; i < str.length/2; i++) {
			String temp =str[i];
			str[i]=str[str.length-(1+i)];
			str[str.length-(1+i)]=temp;
			
		}
		return str;
	}
	public static String[] sortAZ(String str[])
	{

		String temp;
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			count=0;
			temp=str[i];
			for (int j = i; j < str.length; j++) {
				if(str[j].compareTo(str[i])<0) {
					temp=str[i];
					count =j;
					str[i]=str[count];
					str[count]=temp;
				}
			}
			
			
		}
		return str;
	}
	
	
	

}

/************************************************************************
 * this is a program to check if a word is a doubloon. a doubloon is	*
 * a word that has two of each letter in the word. like anna or appall	*
 * in main ive set a var for the word and then check it against a		*
 * funtion. in the function i check each letter of the word to find out	*
 * if all the letters repeat themselves once							*
 * 																		*
 * @author morga														*
 * date 2/25/25															*
 * 																		*
 ************************************************************************/


import java.util.Scanner;

public class doubloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a doubloon");
		String word = input.next();
		if(isdoubloon(word)) {
			System.out.println(word+" is a doubloon!");
			
		}else {
			System.out.println(word+"is NOT a doubloon");
		}

	}
	private static boolean isdoubloon(String word){
		boolean doubloon = false;
		for(int i=0;i< word.length();i++) {
			int count = 0;
			for(int j =0; j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j)) {
					count++;
				}
			}
		if(count!=2)return false;
		}return true;
		}
		
		
		
	}


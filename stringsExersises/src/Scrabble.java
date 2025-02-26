import java.util.Scanner;

public class Scrabble{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter tiles");
		String tiles = input.next();
		System.out.println("enter word you want to spell");
		String word = input.next();
		System.out.println(canSpell(tiles, word));
		
		input.close();
	
	}
	public static boolean canSpell(String tiles, String word){
		for(int i=0;i<word.length();i++) {
			int index= tiles.indexOf(word.charAt(i));
			if(index<0)return false;
			tiles=tiles.substring(0,index)+tiles.substring(index+1);
		}
	return true;
	
	}
	
	
	

}

/**
 * this program will print lyrics for the song 99 bottles of beer on the wall
 * but it asks for how many bottles to start with and then starts the song with 
 * that many bottles
 * @author morga
 * 
 */

package loopsassignment;

import java.util.Scanner;

public class nbottlesofbeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("how many bottles of beer on the wall would you like to start with?");
		int bottlecount = input.nextInt();
		int seccondcount=bottlecount-1;
		int fullbottlecount = bottlecount;
		while (bottlecount >= 0) {
			if (bottlecount == 2) {//this is checking if the song is reaching its end and my product the lines of the song are changing cause of gramar and spelling
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer! \ntake one down and pass it around %d bottle of beer on the wall!\n\n",bottlecount,bottlecount,seccondcount);
				bottlecount--;
				seccondcount--;
			}else if (bottlecount == 1) {//this is the line before the final line of the song
				System.out.printf("%d bottle of beer on the wall, %d bottle of beer! \ntake one down and pass it around %d bottles of beer on the wall!\n\n",bottlecount,bottlecount,seccondcount);
				bottlecount--;
				seccondcount--;
			}else if (bottlecount == 0) {//final line of the song
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer! \n go to the stor n by some more, %d bottles of beer on the wall \n\n",bottlecount,bottlecount,fullbottlecount);
				bottlecount--; // this is the escape line that is used to end the song so it doesnt go on forever. it also is used to decriment the lyrics so its not just repeating the same lyric
				seccondcount--;
			}else //this is most of the lyrics here
			{
			System.out.printf("%d bottles of beer on the wall, %d bottles of beer! \ntake one down and pass it around %d bottles of beer on the wall!\n\n",bottlecount,bottlecount,seccondcount);
			bottlecount--;
			seccondcount--;
			}
		}
	}

}

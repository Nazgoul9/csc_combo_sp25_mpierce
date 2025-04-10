package sandbox;

import java.util.Scanner;

public class TickTackToeFull {
	
	public static void main(String[] args) {

		int player = 1;

		int continues = 1;

		char[] arr = new char[9];

		while(checkWinner(arr, player) == 0 && continues > 0){

		board(arr);

		continues = move(arr, player);

		player = player % 2 + 1;

		}

		if(checkWinner == 0) {

		System.out.println("Tie.");

		}

		else {

		System.out.println("Player " + checkWinner() + " is the winner.");

		}

		}

		// Code for the board and the moves on the board

		public class TicTacToe {

		public static void main(String[] args) {

		char[] arr = new char[9];

		int player = 1;

		for(int i = 0; i < 10; i++)

		{

		board(arr, player);

		}

		}

		public static void board(char[] arr, int player) {

		move(arr, player);

		// Initial board

		System.out.println(arr[0] + "|" + arr[1] + "|" + arr[2]);

		System.out.println("_ _ _");

		System.out.println(arr[3] + "|" + arr[4] + "|" + arr[5]);

		System.out.println("_ _ _");

		System.out.println(arr[6] + "|" + arr[7] + "|" + arr[8]);

		}

		public static void move(char[] arr, int player)

		{

		Scanner input = new Scanner(System.in);

		if (player == 1) {

		System.out.println("In order to place your x on the board, pick a number between 1 and 9");

		int num = input.nextInt()-1;

		if (arr[num] == 'o')

		{

		System.out.println("Cannot have two characters on the same space. Skipping move.");

		} else {

		arr[num] = 'x';

		player++;

		}

		}

		if (player == 2) {

		System.out.println("In order to place your o on the board, pick a number between 1 and 9");

		int num = input.nextInt()-1;

		if (arr[num] == 'x')

		{

		System.out.println("Cannot have two characters on the same space. Skipping move.");

		} else {

		arr[num] = 'x';

		player++;

		}

		}

		}

		}

		private static int checkWinner(int player, char[] arr) {

			if(arr[0]==arr[4]&&arr[0]==arr[8])return player;//checks first diagonal

			if(arr[2]==arr[4]&&arr[2]==arr[6])return player;//checks second diagonal

			for(int i=0;i<3;i++) {//Iterates over each column
				if(arr[i]==arr[i+6]&& arr[i+3]==arr[i+6])return player;//checks each position in the column for equality
				}

			for(int i=0;i<9;i+=3) {//Iterates over each column
				if(arr[i]==arr[i+2]&& arr[i+1]==arr[i+2])return player;//checks each position in the row for equality
				}

			return 0;
			}

}

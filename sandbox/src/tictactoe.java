
public class tictactoe {

	private static int checkWinner(int player, char[] arr) {
//		if(checkRows(player, arr)!=0)return player;
//		if(checkCols(player, arr)!=0)return player;
//		if(checkDiag(player, arr)!=0)return player;
		if(arr[0]==arr[4]&&arr[0]==arr[8])return player;//checks first diagonal
		if(arr[2]==arr[4]&&arr[2]==arr[6])return player;//checks second diagonal
		for(int i=0;i<3;i++) {//itterates over each collum
			if(arr[i]==arr[i+6]&& arr[i+3]==arr[i+6])return player;//checks each position in the colum for equqlity
			}
		for(int i=0;i<9;i+=3) {//itterates over each collum
			if(arr[i]==arr[i+2]&& arr[i+1]==arr[i+2])return player;//checks each position in the row for equqlity
			}
		return 0;
		}

//		private static int checkDiag(int player, char[] arr) {
//		if(arr[0]==arr[4]&&arr[0]==arr[8])return player;//checks first diagonal
//		if(arr[2]==arr[4]&&arr[2]==arr[6])return player;//checks second diagonal
//		return 0;
//	}
//		private static int checkCols(int player,char[] arr) {
//		for(int i=0;i<3;i++) {//itterates over each collum
//		if(arr[i]==arr[i+6]&& arr[i+3]==arr[i+6])return player;//checks each position in the colum for equqlity
//		}
//		return 0;
//		}
//
//		private static int checkRows(int player,char[] arr) {
//		for(int i=0;i<9;i+=3) {//itterates over each collum
//		if(arr[i]==arr[i+2]&& arr[i+1]==arr[i+2])return player;//checks each position in the row for equqlity
//		}
//		return 0;
//		}
		
	
public static void main(String[] args) {
		char[] arr= new char[9];
		for (int i = 0; i < arr.length; i++)arr[i]='x';
		int player =1;
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println(checkWinner(player,arr));
		System.out.println();
//		System.out.println(checkRows(player,arr));
//		System.out.println();
//		System.out.println(checkCols(player,arr));
//		System.out.println();
//		System.out.println(checkDiag(player,arr));
//		System.out.println();
	
	}
}
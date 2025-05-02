
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Connect4{
	private static Scanner input = new Scanner(System.in);
	GameGrid grid;
	MouseEvent e;
	MouseListener f;

 	public Connect4(int rows, int cols, int size) {
		this.grid = new GameGrid(rows, cols, size);

	}

	public void mainloop() {
		
		int player = 1;
		int x = 0;
		int y = 0;
		boolean active = true;
		while (active) {
			grid.repaint();
			boolean draw = drawcheck();
			if(draw)
			{
				System.out.println("draw! nobody wins! enter y to play again");
				String nextGame = input.next();
				if (nextGame.charAt(0) != 'y')
					active = false;
				else boardreset();
					player = 0;
			}
			else if (player == 1) {
				System.out.println("player one, please chose next peice column");
				
				y = input.nextInt() - 1;
				x = checkCol(y);
				if (x == -1) {
					boolean choseNew = true;
					while (choseNew) {
						System.out.println("please chose a valid column");
						y = input.nextInt() - 1;
						if (checkCol(y) == 0)
							choseNew = false;
					}
					x = checkCol(y);
					grid.setP1(x, y);
				} else
					grid.setP1(x, y);
				// column
			} else {
				System.out.println("player two, please chose next peice column");
//				y = mouseClicked(f.);
				y = input.nextInt() - 1;
				x = checkCol(y);
				if (x == -1) {
					boolean choseNew = true;
					while (choseNew) {
						System.out.println("please chose a valid column");
						y = input.nextInt() - 1;
						if (checkCol(y) == 0)
							choseNew = false;
					}
					x = checkCol(y);
					grid.setP2(x, y);
				} else
					grid.setP2(x, y);
			}
			int win = this.checkConnect4();
			if (win >= 4) {
				System.out.println("player " + player + " wins! enter y to play again");
				String nextGame = input.next();
				if (nextGame.charAt(0) != 'y')
					active = false;
				else boardreset();
					player = 0;
			}
			;
			player = player % 2 + 1;
		}
		System.out.println("thanks for playing!");

	}

	private boolean drawcheck() {
		int cols = grid.numcols();
		for (int c = 0; c < cols; c++) {
			if(grid.testplayer(0, c)==0) return false;
		}
		return true;
	}

	private void boardreset() {
		int rows = grid.numrow();
		int cols = grid.numcols();
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				grid.turnOff(r, c);
			}	
		}
		
	}

	private int checkCol(int y) {
		if(y>=7) return -1;
		int rows = grid.numrow();
		int x = rows - 1;
		while (grid.testplayer(x, y) == 1 || grid.testplayer(x, y) == 2) {
			if (x == 0)
				return -1;// exit con without causing an index out of bounds
			x--;
		}
		return x;
	}

	private int checkline(int r, int c, int player) {
		if (grid.testplayer(r, c) == player){
			if (grid.testplayer(r + 1, c + 1) == player){
				if (grid.testplayer(r + 2, c + 2) == player){
					if (grid.testplayer(r + 3, c + 3) == player){
						return 4;
					}
				}
			}
		}
		if (grid.testplayer(r, c) == player){
			if (grid.testplayer(r + 1, c) == player){
				if (grid.testplayer(r + 2, c) == player){
					if (grid.testplayer(r + 3, c) == player){
						return 4;
					}
				}
			}
		}
		if(grid.testplayer(r, c) == player){
			if(grid.testplayer(r + 1, c - 1) == player){
				if(grid.testplayer(r + 2, c - 2) == player){
					if(grid.testplayer(r + 3, c - 3) == player){
						return 4;
					}
				}
			}
		}
		if (grid.testplayer(r, c) == player){
			if (grid.testplayer(r, c + 1) == player){
				if (grid.testplayer(r, c + 2) == player){
					if (grid.testplayer(r, c + 3) == player){
						return 4;
					}
				}
			}
		}

		return 0;
	}
	public int mouseClicked(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		SwingUtilities.convertPointFromScreen(point, e.getComponent());
		int y=(int) point.getY();
		return y;
	}

	private int checkConnect4() {
		grid.repaint();
		int rows = grid.numrow();
		int cols = grid.numcols();
		int count = 0;
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				count = checkline(r, c,1);
				if (count >= 4)
					return count;
				count = checkline(r, c,2);
				if (count >= 4)
					return count;
			}
		}
		return 0;
	}

}

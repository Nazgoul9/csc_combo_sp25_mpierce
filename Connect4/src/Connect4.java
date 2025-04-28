import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Connect4 {
	private static Scanner input = new Scanner(System.in);
	GameGrid grid;

	public Connect4(int rows, int cols, int size) {
		this.grid = new GameGrid(rows, cols, size);
		
		
	}

	public void mainloop() {
		int player = 1;
		int x = 0;
		int y = 0;
		while (true) {
			this.update();
			grid.repaint();
			if(player==1)
			{
				System.out.println("player one, please chose next peice column");
				y=input.nextInt();
				x =checkCol(y);
				if(x==-1) 
				{
					int temp = y;
					boolean choseNew = true;
					while(choseNew)
					{
						System.out.println("please chose a new column, that one is full");
						y=input.nextInt();
						if(checkCol(y)==0) choseNew = false;
					}
				x=checkCol(y);
				grid.setP1(x, y);
				}
				else grid.setP1(x, y);
			//column	
			}
			else
			{
				System.out.println("player two, please chose next peice column");
				y=input.nextInt();
				x =checkCol(y);
				if(x==-1) 
				{
					int temp = y;
					boolean choseNew = true;
					while(choseNew)
					{
						System.out.println("please chose a new column, that one is full");
						y=input.nextInt();
						if(checkCol(y)==0) choseNew = false;
					}
				x=checkCol(y);
				grid.setP2(x, y);
				}
				else grid.setP2(x, y);
			}
			player = player % 2 + 1;
		}

	}
	private int checkCol(int y)
	{
		int rows = grid.numrow();
		int x = rows-1;
		while(grid.testplayer(x, y)==1||grid.testplayer(x, y)==2 ) 
		{
			if(x==0) return-1;//exit con without causing an index out of bounds
			x--;
		}
		return x;
	}
	


	private int checkP1(int r, int c) {
		int count = 0; 
		if(grid.testplayer(r - 1, c - 1)==1)count = checkline(r-1,c-1,1,1,1);
		if(count <=4)return count;
		if(grid.testplayer(r - 1, c)==1)count = checkline(r - 1, c,1,2,1);
		if(count <=4)return count;
		if(grid.testplayer(r - 1, c + 1)==1)count = checkline(r-1,c+1,1,3,1);
		if(count <=4)return count;
		if(grid.testplayer(r, c - 1)==1)count = checkline(r,c-1,1,4,1);
		if(count <=4)return count;
		if(grid.testplayer(r, c + 1)==1)count = checkline(r,c+1,1,5,1);
		if(count <=4)return count;
		if(grid.testplayer(r + 1, c - 1)==1)count = checkline(r+1,c-1,1,6,1);
		if(count <=4)return count;
		if(grid.testplayer(r + 1, c)==1)count = checkline(r+1,c,1,7,1);
		if(count <=4)return count;
		if(grid.testplayer(r + 1, c + 1)==1)count = checkline(r+1,c+1,1,8,1);
		if(count <=4)return count;
		return 0;
	}
	private int checkP2(int r, int c) {
		int count = 0; 
		if(grid.testplayer(r - 1, c - 1)==1)count = checkline(r-1,c-1,2,1,1);
		if(count <=4)return count;
		if(grid.testplayer(r - 1, c)==1)count = checkline(r - 1, c,2,2,1);
		if(count <=4)return count;
		if(grid.testplayer(r - 1, c + 1)==1)count = checkline(r-1,c+1,2,3,1);
		if(count <=4)return count;
		if(grid.testplayer(r, c - 1)==1)count = checkline(r,c-1,2,4,1);
		if(count <=4)return count;
		if(grid.testplayer(r, c + 1)==1)count = checkline(r,c+1,2,5,1);
		if(count <=4)return count;
		if(grid.testplayer(r + 1, c - 1)==1)count = checkline(r+1,c-1,2,6,1);
		if(count <=4)return count;
		if(grid.testplayer(r + 1, c)==1)count = checkline(r+1,c,2,7,1);
		if(count <=4)return count;
		if(grid.testplayer(r + 1, c + 1)==1)count = checkline(r+1,c+1,2,8,1);
		if(count <=4)return count;
		return 0;
	}
	private int checkline(int r, int c, int player, int direction, int count) {
		if(count==4)return 1;
		
		if(direction==1) if(grid.testplayer(r - 1, c - 1)==1)
			return checkline(r-1,c-1,player,direction,count+1)+1;
		
		return count;
	}

	public void update()
	{
		int[][]counts=checkConnect4();
//		mouseClicked()
		
	}
	
//	public void mouseClicked(MouseEvent e) {
//		PointerInfo a = MouseInfo.getPointerInfo();
//		Point point = new Point(a.getLocation());
//		SwingUtilities.convertPointFromScreen(point, e.getComponent());
//		int x=(int) point.getX();
//		int y=(int) point.getY();



	private int[][] checkConnect4() {
		int rows = grid.numrow();
		int cols = grid.numcols();
		int[][]boardGrid = new int[rows][cols];
		for(int r = 0; r<rows; r++)
		{
			for(int c = 0;c<cols;c++)
			{
				boardGrid[r][c] = checkP1(r,c);
				boardGrid[r][c] = checkP2(r,c);
			}
		}
		return boardGrid;
	}

}



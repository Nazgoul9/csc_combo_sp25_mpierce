

public class Connect4 {
	GameGrid grid;

	public Connect4(int rows, int cols, int size) {
		this.grid = new GameGrid(rows, cols, size);
		
		
		grid.setP1(2, 1);
		grid.setP1(2, 2);
		grid.setP1(2, 3);
		grid.setP1(2, 4);
		grid.setP1(1, 6);
		grid.setP2(2, 6);
		grid.setP2(3, 6);
		
	}

	public void mainloop() {
		while (true) {
			this.update();
			grid.repaint();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("you shouldnt be here");
			}
		}

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
	}


	private int[][] checkConnect4() {
		int rows = grid.numrow();
		int cols = grid.numcols();
		int[][]count = new int[rows][cols];
		for(int r = 0; r<rows; r++)
		{
			for(int c = 0;c<cols;c++)
			{
				count[r][c] = checkP1(r,c);
				count[r][c] = checkP2(r,c);
			}
		}
		return count;
	}

}



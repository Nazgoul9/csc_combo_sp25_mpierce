package komigameoflife;

public class Conway {
	Grid grid;

	public Conway(int rows, int cols, int size) {
		this.grid = new Grid(rows, cols, size);

		grid.turnOn(2, 1);
		grid.turnOn(2, 2);
		grid.turnOn(2, 3);
		grid.turnOn(1, 7);
		grid.turnOn(2, 7);
		grid.turnOn(3, 7);
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

	private int countAlive(int r, int c) {
		int count = 0;
		count += grid.test(r - 1, c - 1);
		count += grid.test(r - 1, c);
		count += grid.test(r - 1, c + 1);
		count += grid.test(r, c - 1);
		count += grid.test(r, c + 1);
		count += grid.test(r + 1, c - 1);
		count += grid.test(r + 1, c);
		count += grid.test(r + 1, c + 1);

		return count;
	}

	public void update()
	{
		int[][]counts=countneighbors();
		updategrid(counts);
	}

	private void updategrid(int[][] counts) {
		int rows = grid.numrow();
		int cols = grid.numcols();
		for(int r = 0; r < rows; r++)
		{
			for(int c = 0; c < cols; c++)
			{
				Cell cell = grid.getCell(r,c);
				updateCell(cell,counts[r][c]);
			}
		}
	}

	private static void updateCell(Cell cell, int count) {
		if(cell.issOn()) {
			if(count<2||count>3) {
				cell.turnOff();
			}
		}else
		{
			if(count == 3)
				cell.turnOn();
		}

	}

	private int[][] countneighbors() {
		int rows = grid.numrow();
		int cols = grid.numcols();
		int[][]count = new int[rows][cols];
		for(int r = 0; r<rows; r++)
		{
			for(int c = 0;c<cols;c++)
			{
				count[r][c] = countAlive(r,c);
			}
		}
		return count;
	}

}



package komigameoflife;

import java.awt.Canvas;
import java.awt.Graphics;

public class Grid extends Canvas{
	private Cell[][] array;
	
	public Grid(int rows, int cols, int size) 
	{
		array = new Cell[rows][cols];
		
		for (int r = 0; r < rows; r++) 
		{
			for (int c = 0; c < cols; c++) 
			{
				int x = c*size;
				int y = r*size;
				array[r][c] = new Cell(x,y,size);
			}
		}
		setSize(cols*size, rows*size);
	}
	
	public void draw(Graphics g) 
	{
		for(Cell[] row : array)
		{
			for(Cell cell: row) 
			{
				cell.draw(g);
			}
		}
	}

	public void paint(Graphics g)
	{
		draw(g);
	}

	public int numrow() 
	{
		return array.length;
	}
	public int numcols() 
	{
		return array[0].length;
	}
	
	public Cell getCell(int r, int c)
	{
		return array[r][c];
	}
	public void turnOn(int r, int c)
	{
		array[r][c].turnOn();
	}
	public int test(int r, int c)
	{
		try {
			if(array[r][c].issOn()) {
				return 1;
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{}
		return 0;
	}
	
}
	
	

	
	
	//	public void turnOff(int r, int c)
//	{
//		array[r][c].turnOff();
//	}
//}

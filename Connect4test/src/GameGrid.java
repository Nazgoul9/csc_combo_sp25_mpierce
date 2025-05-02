
import java.awt.Canvas;
import java.awt.Graphics;

public class GameGrid extends Canvas {
	private Chip[][] array;

	public GameGrid(int rows, int cols, int size) {
		array = new Chip[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				int x = c * size;
				int y = r * size;
				array[r][c] = new Chip(x, y, size);
			}
		}
		setSize(cols * size, rows * size);
	}

	public void paint(Graphics g) {
		for (Chip[] row : array) {
			for (Chip cell : row) {
				cell.draw(g);
			}
		}
	}

	public int numrow() {
		return array.length;
	}

	public int numcols() {
		return array[0].length;
	}

	public Chip getChip(int r, int c) {
		return array[r][c];
	}
	

	public void turnOff(int r, int c) {
		array[r][c].turnOff();
	}

	public void setP1(int r, int c) {
		array[r][c].setP1();
	}

	public void setP2(int r, int c) {
		array[r][c].setP2();
	}

	public int testplayer(int r, int c) {
		try {
			if (array[r][c].isP1()) {
				return 1;
			}
			if (array[r][c].isP2()) {
				return 2;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		return 0;


	
	}
}

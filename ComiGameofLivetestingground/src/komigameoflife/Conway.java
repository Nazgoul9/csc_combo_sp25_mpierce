package komigameoflife;

public class Conway {
	Grid grid;

	public Conway() {
		this.grid = new Grid(5,10,20);
		
		grid.setP1(2, 1);
		grid.setP1(2, 2);
		grid.setP1(2, 3);
		grid.setP2(1, 7);
		grid.setP2(2, 7);
		grid.setP2(3, 7);
	}

}
